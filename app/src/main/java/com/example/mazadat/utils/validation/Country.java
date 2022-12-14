package com.example.mazadat.utils.validation;

import java.util.ArrayList;
import java.util.List;

public class Country {
    public List<Country> COUNTRIES = new ArrayList<>();
    private String code;
    private String name;
    private String dialCode;
    private int flag = -1;
    private int length_min = 0;
    private int length_max = 1;

    public static List<Country> allCountriesList;

    public Country(String code, String name, String dialCode, int length_min, int length_max) {
        this.code = code;
        this.name = name;
        this.dialCode = dialCode;
        this.length_min = length_min;
        this.length_max = length_max;
    }

    public Country() {

        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("AD", "Andorra", "+376", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("AE", "United Arab Emirates", "+971", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("AF", "Afghanistan", "+93", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("AG", "Antigua and Barbuda", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("AI", "Anguilla", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("AL", "Albania", "+355", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("AM", "Armenia", "+374", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("AO", "Angola", "+244", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("AQ", "Antarctica", "+672", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("AR", "Argentina", "+54", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("AS", "AmericanSamoa", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("AT", "Austria", "+43", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("AU", "Australia", "+61", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("AW", "Aruba", "+297", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("AX", "??land Islands", "+358", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("AZ", "Azerbaijan", "+994", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BA", "Bosnia and Herzegovina", "+387", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BB", "Barbados", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BD", "Bangladesh", "+880", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BE", "Belgium", "+32", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BF", "Burkina Faso", "+226", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BG", "Bulgaria", "+359", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BH", "Bahrain", "+973", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BI", "Burundi", "+257", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BJ", "Benin", "+229", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BL", "Saint Barth??lemy", "+590", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BM", "Bermuda", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BN", "Brunei Darussalam", "+673", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BO", "Bolivia, Plurinational State of", "+591", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BQ", "Bonaire", "+599", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BR", "Brazil", "+55", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BS", "Bahamas", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BT", "Bhutan", "+975", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BV", "Bouvet Island", "+47", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BW", "Botswana", "+267", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BY", "Belarus", "+375", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("BZ", "Belize", "+501", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CA", "Canada", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CC", "Cocos (Keeling) Islands", "+61", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CD", "Congo, The Democratic Republic of the", "+243", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CF", "Central African Republic", "+236", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CG", "Congo", "+242", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CH", "Switzerland", "+41", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CI", "Ivory Coast", "+225", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CK", "Cook Islands", "+682", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CL", "Chile", "+56", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CM", "Cameroon", "+237", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CN", "China", "+86", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CO", "Colombia", "+57", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CR", "Costa Rica", "+506", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CU", "Cuba", "+53", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CV", "Cape Verde", "+238", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CW", "Curacao", "+599", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CX", "Christmas Island", "+61", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CY", "Cyprus", "+357", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("CZ", "Czech Republic", "+420", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("DE", "Germany", "+49", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("DJ", "Djibouti", "+253", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("DK", "Denmark", "+45", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("DM", "Dominica", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("DO", "Dominican Republic", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("DZ", "Algeria", "+213", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("EC", "Ecuador", "+593", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("EE", "Estonia", "+372", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("EG", "Egypt", "+20", 11, 12));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("EH", "Western Sahara", "+212", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("ER", "Eritrea", "+291", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("ES", "Spain", "+34", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("ET", "Ethiopia", "+251", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("FI", "Finland", "+358", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("FJ", "Fiji", "+679", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("FK", "Falkland Islands (Malvinas)", "+500", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("FM", "Micronesia, Federated States of", "+691", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("FO", "Faroe Islands", "+298", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("FR", "France", "+33", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GA", "Gabon", "+241", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GB", "United Kingdom", "+44", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GD", "Grenada", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GE", "Georgia", "+995", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GF", "French Guiana", "+594", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GG", "Guernsey", "+44", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GH", "Ghana", "+233", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GI", "Gibraltar", "+350", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GL", "Greenland", "+299", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GM", "Gambia", "+220", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GN", "Guinea", "+224", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GP", "Guadeloupe", "+590", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GQ", "Equatorial Guinea", "+240", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GR", "Greece", "+30", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GS", "South Georgia and the South Sandwich Islands", "+500", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GT", "Guatemala", "+502", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GU", "Guam", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GW", "Guinea-Bissau", "+245", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("GY", "Guyana", "+595", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("HK", "Hong Kong", "+852", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("HM", "Heard Island and McDonald Islands", "", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("HN", "Honduras", "+504", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("HR", "Croatia", "+385", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("HT", "Haiti", "+509", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("HU", "Hungary", "+36", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("ID", "Indonesia", "+62", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("IE", "Ireland", "+353", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("IL", "Israel", "+972", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("IM", "Isle of Man", "+44", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("IN", "India", "+91", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("IO", "British Indian Ocean Territory", "+246", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("IQ", "Iraq", "+964", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("IR", "Iran, Islamic Republic of", "+98", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("IS", "Iceland", "+354", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("IT", "Italy", "+39", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("JE", "Jersey", "+44", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("JM", "Jamaica", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("JO", "Jordan", "+962", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("JP", "Japan", "+81", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("KE", "Kenya", "+254", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("KG", "Kyrgyzstan", "+996", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("KH", "Cambodia", "+855", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("KI", "Kiribati", "+686", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("KM", "Comoros", "+269", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("KN", "Saint Kitts and Nevis", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("KP", "North Korea", "+850", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("KR", "South Korea", "+82", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("KW", "Kuwait", "+965", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("KY", "Cayman Islands", "+345", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("KZ", "Kazakhstan", "+7", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("LA", "Lao People\'s Democratic Republic", "+856", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("LB", "Lebanon", "+961", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("LC", "Saint Lucia", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("LI", "Liechtenstein", "+423", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("LK", "Sri Lanka", "+94", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("LR", "Liberia", "+231", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("LS", "Lesotho", "+266", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("LT", "Lithuania", "+370", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("LU", "Luxembourg", "+352", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("LV", "Latvia", "+371", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("LY", "Libyan Arab Jamahiriya", "+218", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MA", "Morocco", "+212", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MC", "Monaco", "+377", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MD", "Moldova, Republic of", "+373", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("ME", "Montenegro", "+382", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MF", "Saint Martin", "+590", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MG", "Madagascar", "+261", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MH", "Marshall Islands", "+692", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MK", "Macedonia, The Former Yugoslav Republic of", "+389", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("ML", "Mali", "+223", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MM", "Myanmar", "+95", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MN", "Mongolia", "+976", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MO", "Macao", "+853", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MP", "Northern Mariana Islands", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MQ", "Martinique", "+596", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MR", "Mauritania", "+222", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MS", "Montserrat", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MT", "Malta", "+356", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MU", "Mauritius", "+230", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MV", "Maldives", "+960", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MW", "Malawi", "+265", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MX", "Mexico", "+52", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MY", "Malaysia", "+60", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("MZ", "Mozambique", "+258", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("NA", "Namibia", "+264", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("NC", "New Caledonia", "+687", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("NE", "Niger", "+227", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("NF", "Norfolk Island", "+672", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("NG", "Nigeria", "+234", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("NI", "Nicaragua", "+505", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("NL", "Netherlands", "+31", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("NO", "Norway", "+47", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("NP", "Nepal", "+977", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("NR", "Nauru", "+674", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("NU", "Niue", "+683", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("NZ", "New Zealand", "+64", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("OM", "Oman", "+968", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("PA", "Panama", "+507", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("PE", "Peru", "+51", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("PF", "French Polynesia", "+689", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("PG", "Papua New Guinea", "+675", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("PH", "Philippines", "+63", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("PK", "Pakistan", "+92", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("PL", "Poland", "+48", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("PM", "Saint Pierre and Miquelon", "+508", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("PN", "Pitcairn", "+872", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("PR", "Puerto Rico", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("PS", "Palestinian Territory, Occupied", "+970", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("PT", "Portugal", "+351", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("PW", "Palau", "+680", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("PY", "Paraguay", "+595", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("QA", "Qatar", "+974", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("RE", "R??union", "+262", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("RO", "Romania", "+40", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("RS", "Serbia", "+381", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("RU", "Russia", "+7", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("RW", "Rwanda", "+250", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SA", "Saudi Arabia", "+966", 9, 12));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SB", "Solomon Islands", "+677", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SC", "Seychelles", "+248", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SD", "Sudan", "+249", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SE", "Sweden", "+46", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SG", "Singapore", "+65", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SH", "Saint Helena, Ascension and Tristan Da Cunha", "+290", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SI", "Slovenia", "+386", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SJ", "Svalbard and Jan Mayen", "+47", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SK", "Slovakia", "+421", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SL", "Sierra Leone", "+232", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SM", "San Marino", "+378", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SN", "Senegal", "+221", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SO", "Somalia", "+252", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SR", "Suriname", "+597", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SS", "South Sudan", "+211", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("ST", "Sao Tome and Principe", "+239", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SV", "El Salvador", "+503", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SX", "Sint Maarten", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SY", "Syrian Arab Republic", "+963", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("SZ", "Swaziland", "+268", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("TC", "Turks and Caicos Islands", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("TD", "Chad", "+235", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("TF", "French Southern Territories", "+262", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("TG", "Togo", "+228", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("TH", "Thailand", "+66", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("TJ", "Tajikistan", "+992", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("TK", "Tokelau", "+690", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("TL", "East Timor", "+670", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("TM", "Turkmenistan", "+993", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("TN", "Tunisia", "+216", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("TO", "Tonga", "+676", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("TR", "Turkey", "+90", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("TT", "Trinidad and Tobago", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("TV", "Tuvalu", "+688", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("TW", "Taiwan", "+886", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("TZ", "Tanzania, United Republic of", "+255", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("UA", "Ukraine", "+380", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("UG", "Uganda", "+256", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("UM", "U.S. Minor Outlying Islands", "", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("US", "United States", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("UY", "Uruguay", "+598", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("UZ", "Uzbekistan", "+998", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("VA", "Holy See (Vatican City State)", "+379", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("VC", "Saint Vincent and the Grenadines", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("VE", "Venezuela, Bolivarian Republic of", "+58", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("VG", "Virgin Islands, British", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("VI", "Virgin Islands, U.S.", "+1", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("VN", "Viet Nam", "+84", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("VU", "Vanuatu", "+678", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("WF", "Wallis and Futuna", "+681", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("WS", "Samoa", "+685", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("XK", "Kosovo", "+383", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("YE", "Yemen", "+967", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("YT", "Mayotte", "+262", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("ZA", "South Africa", "+27", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("ZM", "Zambia", "+260", 0, 1));
        COUNTRIES.add(new com.example.mazadat.utils.validation.Country("ZW", "Zimbabwe", "+263", 0, 1));

    }

    public com.example.mazadat.utils.validation.Country getCountry(String code) {

        for (int i = 0; i < COUNTRIES.size(); i++) {
            if (COUNTRIES.get(i).getCode().equals(code)) {
                return COUNTRIES.get(i);
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDialCode() {
        return dialCode;
    }

    public void setDialCode(String dialCode) {
        this.dialCode = dialCode;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getLength_min() {
        return length_min;
    }

    public void setLength_min(int length_min) {
        this.length_min = length_min;
    }

    public int getLength_max() {
        return length_max;
    }

    public void setLength_max(int length_max) {
        this.length_max = length_max;
    }
}
