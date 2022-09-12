package com.example.mazadat.utils;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;

import com.yarolegovich.slidingrootnav.R.id;
import com.yarolegovich.slidingrootnav.R.string;
import com.yarolegovich.slidingrootnav.SlideGravity;
import com.yarolegovich.slidingrootnav.SlidingRootNav;
import com.yarolegovich.slidingrootnav.SlidingRootNavLayout;
import com.yarolegovich.slidingrootnav.callback.DragListener;
import com.yarolegovich.slidingrootnav.callback.DragStateListener;
import com.yarolegovich.slidingrootnav.transform.CompositeTransformation;
import com.yarolegovich.slidingrootnav.transform.ElevationTransformation;
import com.yarolegovich.slidingrootnav.transform.RootTransformation;
import com.yarolegovich.slidingrootnav.transform.ScaleTransformation;
import com.yarolegovich.slidingrootnav.transform.YTranslationTransformation;
import com.yarolegovich.slidingrootnav.util.ActionBarToggleAdapter;
import com.yarolegovich.slidingrootnav.util.DrawerListenerAdapter;
import com.yarolegovich.slidingrootnav.util.HiddenMenuClickConsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SlidingRootNavBuilder {
    private static final float DEFAULT_END_SCALE = 0.65F;
    private static final int DEFAULT_END_ELEVATION_DP = 8;
    private static final int DEFAULT_DRAG_DIST_DP = 180;
    private Activity activity;
    private ViewGroup contentView;
    private View menuView;
    private int menuLayoutRes;
    private List<RootTransformation> transformations;
    private List<DragListener> dragListeners;
    private List<DragStateListener> dragStateListeners;
    private int dragDistance;
    private Toolbar toolbar;
    private SlideGravity gravity;
    private boolean isMenuOpened;
    private boolean isMenuLocked;
    private Bundle savedState;
    public SlidingRootNavBuilder(Activity activity, SlideGravity slideGravity) {
        this.activity = activity; this.gravity = slideGravity;
        this.transformations = new ArrayList();
        this.dragListeners = new ArrayList();
        this.dragStateListeners = new ArrayList();
        this.dragDistance = this.dpToPx(150);
    }

    public SlidingRootNavBuilder withMenuView(View view) {
        this.menuView = view;
        return this;
    }

    public SlidingRootNavBuilder withMenuLayout(@LayoutRes int layout) {
        this.menuLayoutRes = layout;
        return this;
    }

    public SlidingRootNavBuilder withToolbarMenuToggle(Toolbar tb) {
        this.toolbar = tb;
        return this;
    }

    public SlidingRootNavBuilder withGravity(SlideGravity g) {
        this.gravity = g;
        return this;
    }

    public SlidingRootNavBuilder withContentView(ViewGroup cv) {
        this.contentView = cv;
        return this;
    }

    public SlidingRootNavBuilder withMenuLocked(boolean locked) {
        this.isMenuLocked = locked;
        return this;
    }

    public SlidingRootNavBuilder withSavedState(Bundle state) {
        this.savedState = state;
        return this;
    }

    public SlidingRootNavBuilder withMenuOpened(boolean opened) {
        this.isMenuOpened = opened;
        return this;
    }

    public SlidingRootNavBuilder withDragDistance(int dp) {
        return this.withDragDistancePx(this.dpToPx(dp));
    }

    public SlidingRootNavBuilder withDragDistancePx(int px) {
        this.dragDistance = px;
        return this;
    }

    public SlidingRootNavBuilder withRootViewScale(@FloatRange(from = 0.009999999776482582D) float scale) {
        this.transformations.add(new ScaleTransformation(scale));
        return this;
    }

    public SlidingRootNavBuilder withRootViewElevation(@IntRange(from = 0L) int elevation) {
        return this.withRootViewElevationPx(this.dpToPx(elevation));
    }

    public SlidingRootNavBuilder withRootViewElevationPx(@IntRange(from = 0L) int elevation) {
        this.transformations.add(new ElevationTransformation((float)elevation));
        return this;
    }

    public SlidingRootNavBuilder withRootViewYTranslation(int translation) {
        return this.withRootViewYTranslationPx(this.dpToPx(translation));
    }

    public SlidingRootNavBuilder withRootViewYTranslationPx(int translation) {
        this.transformations.add(new YTranslationTransformation((float)translation));
        return this;
    }

    public SlidingRootNavBuilder addRootTransformation(RootTransformation transformation) {
        this.transformations.add(transformation);
        return this;
    }

    public SlidingRootNavBuilder addDragListener(DragListener dragListener) {
        this.dragListeners.add(dragListener);
        return this;
    }

    public SlidingRootNavBuilder addDragStateListener(DragStateListener dragStateListener) {
        this.dragStateListeners.add(dragStateListener);
        return this;
    }

    public SlidingRootNav inject() {
        ViewGroup contentView = this.getContentView();
        View oldRoot = contentView.getChildAt(0);
        contentView.removeAllViews();
        SlidingRootNavLayout newRoot = this.createAndInitNewRoot(oldRoot);
        View menu = this.getMenuViewFor(newRoot);
        this.initToolbarMenuVisibilityToggle(newRoot, menu);
        HiddenMenuClickConsumer clickConsumer = new HiddenMenuClickConsumer(this.activity);
        clickConsumer.setMenuHost(newRoot);
        newRoot.addView(menu);
        newRoot.addView(clickConsumer);
        newRoot.addView(oldRoot);
        contentView.addView(newRoot);
        if (this.savedState == null && this.isMenuOpened) {
            newRoot.openMenu(false);
        }

        newRoot.setMenuLocked(this.isMenuLocked);
        return newRoot;
    }

    private SlidingRootNavLayout createAndInitNewRoot(View oldRoot) {
        SlidingRootNavLayout newRoot = new SlidingRootNavLayout(this.activity);
        newRoot.setId(id.srn_root_layout);
        newRoot.setRootTransformation(this.createCompositeTransformation());
        newRoot.setMaxDragDistance(this.dragDistance);
        newRoot.setGravity(this.gravity);
        newRoot.setRootView(oldRoot);
        Iterator var3 = this.dragListeners.iterator();

        while(var3.hasNext()) {
            DragListener l = (DragListener)var3.next();
            newRoot.addDragListener(l);
        }

        var3 = this.dragStateListeners.iterator();

        while(var3.hasNext()) {
            DragStateListener l = (DragStateListener)var3.next();
            newRoot.addDragStateListener(l);
        }

        return newRoot;
    }

    @SuppressLint("ResourceType")
    private ViewGroup getContentView() {
        if (this.contentView == null) {
            this.contentView = (ViewGroup)this.activity.findViewById(16908290);
        }

        if (this.contentView.getChildCount() != 1) {
            throw new IllegalStateException(this.activity.getString(string.srn_ex_bad_content_view));
        } else {
            return this.contentView;
        }
    }

    private View getMenuViewFor(SlidingRootNavLayout parent) {
        if (this.menuView == null) {
            if (this.menuLayoutRes == 0) {
                throw new IllegalStateException(this.activity.getString(string.srn_ex_no_menu_view));
            }

            this.menuView = LayoutInflater.from(this.activity).inflate(this.menuLayoutRes, parent, false);
        }

        return this.menuView;
    }

    private RootTransformation createCompositeTransformation() {
        return this.transformations.isEmpty() ? new CompositeTransformation(Arrays.asList(new ScaleTransformation(0.65F), new ElevationTransformation((float)this.dpToPx(8)))) : new CompositeTransformation(this.transformations);
    }

    protected void initToolbarMenuVisibilityToggle(SlidingRootNavLayout sideNav, View drawer) {
        if (this.toolbar != null) {
            ActionBarToggleAdapter dlAdapter = new ActionBarToggleAdapter(this.activity);
            dlAdapter.setAdaptee(sideNav);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this.activity, dlAdapter, this.toolbar, string.srn_drawer_open, string.srn_drawer_close);
            toggle.syncState();
            DrawerListenerAdapter listenerAdapter = new DrawerListenerAdapter(toggle, drawer);
            sideNav.addDragListener(listenerAdapter);
            sideNav.addDragStateListener(listenerAdapter);



        }

    }

    private int dpToPx(int dp) {
        return Math.round(this.activity.getResources().getDisplayMetrics().density * (float)dp);
    }
}
