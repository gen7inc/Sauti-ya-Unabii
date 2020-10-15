package com.nash.sautiyaunabii;

/**
 * This is the class for the question in the Roho ya unabii app. It's for all the questions
 * found in all the questions for each section, pls update immediately as soon as a new version
 * or the app becomes available in the app market.
 * <p>
 * Developer: Enosy, Nashon Gama
 * Date: Wednesday, May 27, 2020 23:51 hours
 */

public class Questions {
    //In this class we have a lot of strings for several questions. Pls keep in touch.
    private String muhimu;
    private String maswali_ya_somo_la;
    private String kwanza;
    private String kwanza_A;
    private String kwanza_B;
    private String kwanza_C;
    private String pili;
    private String pili_A;
    private String pili_B;
    private String pili_C;
    private String tatu;
    private String tatu_A;
    private String tatu_B;
    private String tatu_C;
    private String nne;
    private String nne_A;
    private String nne_B;
    private String nne_C;
    private String tano;
    private String tano_A;
    private String tano_B;
    private String tano_C;
    private String ahadi_Text;
    private String jina_Label;
    private String jina_TextField;
    private String kumbuka_Text;
    private String kusanya;

    public static final Questions[] questions = {
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi. Angalia mfano katika swali la kwanza", "MASWALI YA SOMO LA 1",
                    "1. Ni watu gani wanaosema hakuna MUNGU?", "A. Watu wenye akili wanajua kuwa hakuna MUNGU.",
                    "B. Watu wasio na akili wanasema hakuna MUNGU.", "C. Watu walioendelea wanasema hakuna MUNGU.",
                    "2. Kuna MUNGU wangapi walio hai?", "A. Yuko MUNGU mmoja tu.", "B. Kuna miungu mingi sana.", "C. Kila " +
                    "mwanadamu ni mungu.", "3. MUNGU anasema na watu wa namna gani?", "A. Anatumia viongozi wa dini.", "B. Ametumia " +
                    "watawala wakuu.", "C. Alisema uso kwa uso, alitumia manabii, Mwana wake, na Roho Mtakatifu", "4. MUNGU ana tabia gani?",
                    "A. MUNGU ni mkali sana hataki kusamehe.", "B. MUNGU anawachukia wenye dhambi.", "C. MUNGU ni pendo.",
                    "5. MUNGU anazungumza na watoto wake wakati gani?", "A. Wakati wa mikutano mikubwa mikubwa", "B. Kwa njia ya Roho " +
                    "Mtakatifu, neno lake na kwa viumbe alivyoviumba.", "C. Kwa njia ya wahubiri", " AHADI: Naamini kwamba MUNGU ananipenda " +
                    "sana, nami naahidi kuendelea kujifunza kwake.", "Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" " +
                    " mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n Asante sana.", "Kusanya"),

            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.",
                    "MASWALI YA SOMO LA 2", "1. Hapo mwanzo MUNGU aliumba nini?", "A. MUNGU aliumba wanyama",
                    "B. MUNGU aliziumba mbingu na nchi", "C. Hatujui kwa sababu hatukumwona alipoumba.",
                    "2. Adamu alitoka wapi?", "A. Adamu aliumbwa na MUNGU kutoka katika mavumbi.", "B. Adamu ni mjukuu wa nyani",
                    "C. Adamu alitokea tu akawa mtu.", "3. Hawa aliumbwa kwa njia gani?", "A. MUNGU alikata mkono wa Adamu akau" +
                    "fanya Hawa", "B. MUNGU alichukua mavumbi akamuumba Hawa.", "C. MUNGU alichukua ubavu wa Adamu akaufanya Hawa",
                    "4. Nani walioshiriki katika uumbaji?", "A. MUNGU Baba, Mwana na Roho", "B. Malaika wa mbinguni na MUNGU",
                    "C. Hawakushirikiana", "5. MUNGU alichukua siku ngapi kuiumba dunia?", "A. Alichukua miaka milioni nyingi.",
                    "B. Alichukua siku sita tu.", "C. Alikukua siku moja.", "Nimeamini kuwa MUNGU ndiye Muumbaji wangu, na " +
                    "naahidi kuendelea kujifunza kwake." ,"Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.",
                    "MASWALI YA SOMO LA 3", "1. Kweli ni nini?", "A. Kila neno asemalo kiongozi wa dini " +
                    "ndilo kweli.", "B. Neno la MUNGU ndiyo kweli.", "C. Lolote linalosemwa na kanisa ni kweli.",
                    "2. Neno la MUNGU lina faida gani kwetu?", "A. Linarudisha nyuma maendeleo ya nchi.", "B. Halifai kwa " +
                    "kizazi hiki.", "C. Linafaa kwa mafundisho.", "3. Kwa nini Biblia ni kitabu cha MUNGU?", "A. Kwa sababu " +
                    "ya unabii uliotimizwa.", "B. Kwa sababu inamtaja YESU.", "C. Kwa sababu haikuanzishwa na wanadamu",
                    "4. Je, MUNGU asiye na kigeugeu anaweza kubadili maneno yake?", "A. Mara nyingi MUNGU anaweza kubadili maneno " +
                    "Yake.", "B. Maneno aliyosema MUNGU hayabadiliki kamwe.", "C. Huwezi kuamini kila neno analosema MUNGU.",
                    "5. Neno la MUNGU ni kwa taifa gani?", "A. Neno la MUNGU ni kwa Wayahudi.", "B. Neno la MUNGU ni kwa " +
                    "Wazungu tu.", "C. Neno la MUNGU ni kwa mataifa yote.", "Naamini kwamba Biblia ni neno la MUNGU kwangu. " +
                    "Nitafuata mafundisho yake bila kujali dhihaka za watu.", "Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.", "MASWALI YA SOMO LA 4", "1. Shetani alipokuwa mbinguni aliitwaje?",
                    "A. Aliitwa Lusifa", "B. Aliitwa Joka", "C. Aliitwa Ibilisi", "2. Malaika ni akina nani?",
                    "A. Ni roho za watu waliokufa.", "B. Ni viumbe nusu nusu", "C. Ni viumbe walioumbwa na MUNGU.",
                    "3. Shetani ana umbo gani?", "A. Ana pembe, mkia na magamba mwilini", "B. Ni malaika mzuri wa nuru",
                    "C. Ana umbo la nyoka", "4. Kwa nini MUNGU hakumwangamiza Shetani?", "A. Shetani ana nguvu zaidi ya MUNGU",
                    "B. Malaika wasiokosa wangemfikiria MUNGU kuwa hana haki", "C. MUNGU alitaka kuwatesa wanadamu", "5. " +
                    "Nani anayestahili kulindwa na malaika wa MUNGU?", "A. Yeyote anayemfanya YESU kuwa Bwana na Mwokozi wake.", "B. " +
                    "Mtu anayetenda dhambi makusudi", "C. Watoto wachanga tu.", "Nimetambua kuwa MUNGU ananipenda sana. Naahidi " +
                    "kuendelea kujifunza kwake.", "Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.", "MASWALI YA SOMO LA 5","1. Mtu atenday dhambi ana hali gani?",
                    "A. Yuko huru kweli kweli", "B. Anaheshimiwa na watu wote.", "C. Ni mtumwa wa dhambi", "2. " +
                    "Adamu na Hawa walifanya kosa gani?", "A. Walikula matunda ya mti uliokatazwa", "B. Kila mmoja alimshitaki mwingine",
                    "C. Walifanya zinaa", "3. Shetani alitokea bustanini kwa umbo gani?", "A. Alitokea bustanini kama Simba", "B. " +
                    "Alitokea bustanini kama Nyoka", "C. Alitokea bustanini kama malaika", "4. Adamu alipokosa alipoteza kitu gani cha thamani?",
                    "A. Alimpoteza mkewe Hawa", "B. Alipoteza chakula chake", "C. Alipoteza uzima wa milele", "5. Uhusiano kati " +
                    "ya MUNGU, Adamu na Hawa ulikuwaje walipokosa?", "A. MUNGU aliwakasirikia sana.", "B. MUNGU aliwapenda lakini alichukia " +
                    "dhambi", "C. MUNGU hakujali dhambi waliyofanya", "Nimetambua kuwa MUNGU ananipenda sana. Naahidi " +
                    "kuendelea kujifunza kwake.", "Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.", "MASWALI YA SOMO LA 6","1. Mtu anawezaje kuokoka kutoka " +
                    "katika nguvu za Shetani?", "A. Kwa njia ya YESU Kristo tu.", "B. Kwa nguvu zake mwenyewe", "C. " +
                    "Kwa kujiunga na kanisa la kweli", "2. Adamu na Hawa walipokosa MUNGU alisemaje?", "A. Alisema angewaharibu mara moja.",
                    "B. Alisema angemharibu Shetani mara moja", "C. Alisema angemtuma mtu wa kuwaokoa toka kwa Shetani", "3. Tunawezaje " +
                    "kusamehewa dhambi zetu?", "A. Tukizificha sana ili MUNGU asizione.", "B. Tukiziungama na kuziacha atatusamehe", "" +
                    "Tukitamka tu neto \"TOBA\" inatosha", "4. MUNGU anataka watu wangapi waokolewe?", "A. Watu milioni mbili tu.", "B. " +
                    "Watu wachache sana.", "Anataka watu wote waokolewe.", "5. Kwa sababu gani sio wote watakaookolewa?", "A. Watu wana " +
                    "uhuru kuchagua wokovu au kupotea", "B. MUNGU amewaandikia wengi kwenda motoni", "C. MUNGU amechagua wa kupotea na wa kuokoka",
                    "Nimetambua kuwa MUNGU ananipenda sana. Naahidi " +
                            "kuendelea kujifunza kwake.", "Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.", "MASWALI YA SOMO LA 7", "1. Mwanadamu ana sehemu gani katika mpango " +
                    "wa wokovu?", "A. Ni kwa kumwamini YESU, kutubu, kuungama dhambi, kubatizwa na kuishi maisha mapya", "B. Mwanadamu " +
                    "hana sehemu yoyote katika mpango wa wokovu", "C. Mwanadamu anatakiwa kutoa sadaka nyingi kwa MUNGU.", "2. Tunawezaje " +
                    "kupata ushindi mkuu juu ya dhambi?", "A. Kwa kufunga mwezi mmoja kila mwaka", "B. Kwa kuwapa maskini chakula", "C. " +
                    "Kwa njia ya YESU Kristo aliyetupenda", "3. Tukimkosea mtu mwingine tumwambie nani?", "A. Tuwaambie watu wote juu ya jambo " +
                    "hili", "B. Tumwombe msamaha yule tuliyemkosea", "C. Tukae kimya tu na kusahau yote yaliyotokea", "4. Tunajuaje kama " +
                    "dhambi zetu zimesamehewa?", "A. Tunaona moyoni kwamba zimesamehewa.", "B. Watu husema kwamba MUNGU atazisamehe", "" +
                    "MUNGU mwenyewe asema atazisamehe", "5. Tukimwibia mtu mwingine kitu chake tufanyeje?", "A. Kama hatujui tusithubutu " +
                    "kumwambia", "B. Tumwombe msamaha na kumrudishia kitu chake", "Tumwendee na kumwomba atusamehe", "AHADI: Nimetambua kuwa MUNGU ananipenda sana. Naahidi " +
                    "kuendelea kujifunza kwake.", "Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.", "MASWALI YA SOMO LA 8", "1. Majina ya wale wanaompenda " +
                    "MUNGU yanaandikwa wapi?", "A. Katika kitabu cha Ukumbusho.", "B. Katika kitabu cha uzima", "C. " +
                    "Katika Vitabu vya Matendo ya Wanadamu", "2. Watu watahukumiwa kwa sheria gani?", "A. Kwa Amri kumi za MUNGU.",
                    "Kwa sheria iliyowekwa na kanisa.", "Kiongozi akiniambia nitaokoka basi nitaokoka tu", "3. Je, MUNGU anaona kila " +
                    "tendo na wazo langu?", "A. Nikifanya mabaya usiku hawezi kuniona", "B. Sidhani ya kwamba anayajua mawazo yangu.", "" +
                    "Ndiyo, anaona kila tendo na wazo langu", "4. Je, MUNGU anasahau makosa yetu?", "A. Ndiyo, anasahau makosa yetu.", "B. " +
                    "La, hasahau kamwe makosa yetu.", "Nadhani anaweza kukumbuka machache tu.", "5. Saa ya hukumu itakuja lini?", "Imekwisha " +
                    "kuja na sasa inaendelea", "B. Itakuja mwisho wa dunia", "C. Ilikwisha kuja katika siku za Paulo", "AHADI: Nataka " +
                    "YESU Kristo aongoze maisha yangu kila siku ili jina langu libaki katika kitabu cha Uzima.",
                    "Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.", "MASWALI YA SOMO LA 9", "1. MUNGU alitumia vitu gani viwili kumuumba " +
                    "mtu?", "A. Mavumbi na pumzi ya uhai (roho)", "B. Mwili na ndani yake akamtia mtu mdogo (roho)", "C. Mavumbi " +
                    "na maji", "2. Mtu aliyekufa ana ufahamu gani?", "A. Anajua mambo ninayoyafanya.", "Hajui neno lolote.", "C. " +
                    "Ana ujuzi hata kuwapita wana chuo", "3. Shetani alisema uongo gani wa kwanza duniani?", "A. Alisema, \"Hakika hamtakufa\"", "B. " +
                    "Alisema, \"Hakika mtakufa\".", "C. Alisema, \"Mtakuwa matajiri\".", "4. Anafanyaje kuuficha uongo huo?", "A. " +
                    "Anamleta ndugu yetu aliyekufa.", "B. Anawashawishi watu wasisome Biblia.", "C. Anaweza kuja kwetu katika umbo la ndugu " +
                    "aliyekufa.", "5. Je, wafu wako wapi?", "A. Wengine wako motoni, wengine mbinguni.", "B. Wanatembea huku na huko kama " +
                    "mizimu.", "C. Wako makaburini mwao mpaka siku ya Ufufuo.", "AHADI: Shetani ni muongo, mara zote anapingana MUNGU. Nataka " +
                    "YESU Kristo aniongoze kila siku ili niweze kushinda majaribu ya Shetani.", "Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.", "MASWALI YA SOMO LA 10", "1. YESU amekwenda mbinguni kutufanyia " +
                    "nini?", "A. Kutushtaki kwa Baba yake.", "B. Kutuandalia mahali pa kukaa.", "C. Kumwomba Babake atupatie " +
                    "mali.", "2. YESU atakuja siku gani", "A. Hatujui siku wala saa", "B. Miaka elfu moja ijayo.", "C. Sijui kama " +
                    "atakuja kweli.", "3. Ni wangapi watakaomwona YESU akija?", "A. Watu wote wa Mashariki ya Kati", "B. Watu wa miji mikubwa " +
                    "ya dunia", "C. Kila jicho litamwona.", "4. Twawezaje kujua kama kuja kwa YESU ni karibu?", "A. Kwa kuziangalia dalili " +
                    "za nyakati", "B. Kwa kusikia tu.", "C. Kwa kutegemea maoni ya watu", "Kwa nini YESU anakuja mara ya pili?", "A. " +
                    "Kuwafia tena wasiotaka kutubu", "B. Kuwachukua mbinguni watu wanaomwamini.", "C. Kumwambia Shetani atawale dunia yote.",
                    "AHADI: Shetani ni muongo, mara zote anapingana MUNGU. Nataka " +
                            "YESU Kristo aniongoze kila siku ili niweze kushinda majaribu ya Shetani.", "Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.", "MASWALI YA SOMO LA 11", "1. Mwili wetu ni mali ya nani?",
                    "A. Ni mali yetu wenyewe.", "B. Ni mali ya KRISTO", "C. Ni mali ya Shetani.", "2. Tunapokula " +
                    "na kunywa tunafanyaje?", "A. Tule na kunywa kwa utukufu wa MUNGU", "B. Tule na kunywa kama tupendavyo.", "C. " +
                    "Tule vyote maana vimetakaswa na MUNGU.", "3. Kwa nini MUNGU hataki tule nguruwe?", "A. Ana mafuta mengi sana.", "B. " +
                    "Anavyo viini vya ugonjwa viitwavyo \"TRICHINAE\"", "C. Si rahisi kumkamata na kumchinja ili damu imwagike.", "4. Afya ingetu" +
                    "zwaje?", "A. Ingetunzwa kwa makini kama itunzwavyo tabia.", "B. Mkristo asijali afya, ashike dini tu.",
                    "C. Hakuna maana kuutunza mwili utakaooza kaburini.", "5. Chai, Kahawa, tumbako na pombe vina ubaya gani?",
                    "A. Havina ubaya wo wote", "B. Pombe na Tumbako ndivyo vibaya.", "C. Vyote vina madhara katika miili " +
                    "yetu.", "AHADI: Mwili wangu ni hekalu la Roho mtakatifu; Naahidi kuutunza kwa utukufu wa MUNGU wangu.",
                    "Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.", "MASWALI YA SOMO LA 12", "1. Nawezaje kumwibia MUNGU?",
                    "A. Nisiporudisha Zaka na Sadaka", "B. Nikikataa kulipa madeni kwa watu", "C. Nikimwibia " +
                    "mchungaji fedha zake", "2. Zaka ni sehemu ya ngapi ya mapato yetu?", "A. Ni sehemu ya tano ya mapato yetu",
                    "B. Ni theluthi moja ya mapato yetu", "C. Ni sehemu ya kumi ya mapato yetu", "3. Jambo gani linampata asi" +
                    "yerudisha zaka?", "A. Yeye mwenyewe anajiletea laana", "B. Anabarikiwa sana", "C. MUNGU anamwambia, \"Vyema " +
                    "mtumishi wema!\"", "4. Je, MUNGU anataka zaka ya pesa tu?", "A. Anataka zaka ya pesa tu", "B. Anataka turudishe " +
                    "zaka kwa kila kitu tunachopata", "C. Anataka zaka ya pesa na ng'ombe, basi.", "5. Je, naweza kuzuia zaka ili nilipie " +
                    "madeni?", "A. Utakuwa unamnyang'anya MUNGU", "B. Ni heri kulipa madeni kwanza.", "C. Ni hiari yako kufanya linalofaa.",
                    "AHADI: Nimetambua kwamba zaka ni ya MUNGU. Tangu leo nitamrudishia MUNGU sehemu ya kumi ya mapato yangu yote.",
                    "Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.", "MASWALI YA SOMO LA 13", "1. Mtu akimtii MUNGU nusu-nusu inaonesha " +
                    "nini?", "A. Kwamba bado anampenda Shetani.", "B. Kwamba hapendelei upande wowote.", "C. Kwamba anampenda " +
                    "MUNGU kwa moyo wote.", "2. Je, MUNGU alijali Adamu na Hawa walipoanguka?", "A. Aliliachilia mbali jambo lile na kulipuuzia.",
                    "B. MUNGU hakumwadhibu kwa kosa hilo.", "C. Ndiyo, aliwaadhibu kwa kutotii kwao","3. Mtu akishika amri tisa " +
                    "anamtii MUNGU kweli?", "A. Ndiyo, anamtii MUNGU kwelikweli", "B. Amri moja tu iliyobaki haileti tofauti yoyote.",
                    "C. La, hamtii MUNGU kwa kweli.", "4. Ni nani atakayeingia mbinguni?", "A. Asemaye kwa mdomo tu kuwa ameokolewa.",
                    "B. Ni yule afanyaye mapenzi ya MUNGU", "C. Ni yule asemaye, \"Bwana! Bwana\"", "5. Rafiki za YESU ni akina nani?",
                    "A. Ni wale watendao anayowaamuru", "B. Ni wale wanaomwamini YESU ila hawashiriki amri kumi", "C. Ni wale wanaokwenda " +
                    "kanisani jumapili kwa uaminifu", "AHADI: Nimetambua vizuri amri kumi za MUNGU. Kwa Uongozi wa Roho mtakatifu nitazishika " +
                    "zote kwa uaminifu.", "Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.", "MASWALI YA SOMO LA 14", "1. Kichwa cha Kanisa ni nani?",
                    "A. Ni papa mtakatifu", "B. Ni YESU Kristo", "C. Ni Mtume Petro", "2. Mwamba ule Kristo atakapolijenga " +
                    "kanisa lake ni nini/nani?", "A. Mwamba ule ni Kristo mwenyewe.", "B. Mwamba ule ni Petro", "C. Mwamba ule uko " +
                    "mjini Yerusalemu.", "3. Ubatizo wa Biblia ni upi?", "A. Kunyinyiza maji kichwani", "B. Kumwagilia maji kichwani",
                    "C. Kuzamisha mwili wote ndani ya maji.", "4. Mtu awezaje kuwa mshiriki wa kanisa la MUNGU?", "A. Afundishwe yote," +
                    "atubu, aungame, abatizwe.", "B. Anapoandikisha jina lake kanisani", "C. Anapotoa sadaka ndogo ya uanachama.", "5. " +
                    "Rafiki za YESU ni akina nani?", "A. Ni wale watendao anayowaamuru.", "B. Wanaomwamini YESU.", "C. Ni wale " +
                    "wanaomfahamu YESU.", "AHADI: Nataka kubatizwa kwa kuzamishwa majini kama YESU alivyobatizwa.",
                    "Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.", "MASWALI YA SOMO LA 15", "1. Jirani yangu ni nani?", "A. " +
                    "Ni mtu yeyote ahitajiye msaada wangu.", "B. Ni rafiki yangu nimpendaye sana", "C. Ni mtu aishiye karibu na " +
                    "nyumba yangu.", "2. Umpende jirani yako kwa kadiri gani?", "A. Kwa kiasi tu.", "B. Kuliko unavyojipenda " +
                    "mwenyewe.", "C. Kama nafsi yako.", "3. Utajuaje kuwa unampenda jirani yako?", "A. Ukizishika amri nne za kwanza.",
                    "B. Ukizishika amri sita za mwisho.", "C. Ukisalimu kila siku.", "4. Ukipata sh. 10,000/= Zaka itakuwa shilingi ngapi?",
                    "A. Zaka itakuwa Shs. 1,000/=", "B. Zaka itakuwa Shs. 500/=", "C. Zaka itakuwa Shs. 5,000/=", "5. Zaka hii " +
                    "inatumikaje?", "A. Kulipa kodi ya nyumba.", "B. Kulipa madeni kwa wengine.", "C. Kuwapatia riziki wale waihubirio " +
                    "injili.", "AHADI: Kwa uwezo wa MUNGU naahidi kumpenda jirani yangu kama nafsi yangu.",
                    "Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.", "MASWALI YA SOMO LA 16", "1. Wajibu wote wa mwanadamu ni upi?",
                    "A. Kwenda kanisani mara moja kwa juma", "B. Kuzishika Amri kumi za MUNGU.", "C. Kushika Amri za " +
                    "MUNGU tisa.", "2. Upendo wetu kwa MUNGU unapimwaje?", "A. Inatosha tukimwambia kila siku kuwa tunampenda",
                    "B. Tukiwatendea mema wenzetu", "C. Kwa kuzishika amri Nne za kwanza.", "3. Upendo wetu kwa wanadamu wenzetu " +
                    "unadhihiraikaje?", "A. Kwa kuzishika amri Sita za mwisho", "B. Kwa kuwakaribisha nyumbani mwetu", "C. Kwa " +
                    "kujipendekeza sana kwao.", "4. Je, amri za MUNGU zinaweza kubadilika?", "A. Mwanadamu anaweza kuzibadilisha kama " +
                    "atakavyo", "B. Hazibadiliki, zinadumu milele", "C. Zinaweza kukubalika kulingana na mazingira ili zisipitwe na " +
                    "wakati.", "5. Aliyeziandika Amri Kumi ni nani?", "A. Aliyeziandika ni MUNGU.", "Aliyeziandika ni Musa.",
                    "C. Aliyeziandika ni Nehemia.", "AHADI: Kwa kuwa YESU ameniokoa toka dhambini, nitamwonesha pendo langu kwa " +
                    "kushika Amri Kumi kwa neema yake ili nisimwaibishe tena.",
                    "Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.", "MASWALI YA SOMO LA 17","1. Ni siku gani ambayo MUNGU anataka tuikumbuke?",
                    "A. Siku ya Sabato", "B. Siku ya Ufufuo", "C. Siku ya kusulubiwa kwa YESU.", "2. Kwa nini MUNGU ali" +
                    "pumzika siku ya Saba?", "A. Alikuwa amechoka sana.", "B. Alitoa kielelezo mbele ya watoto wake", "C. Ubongo wake " +
                    "haukuweza kufikiri vizuri.", "3. Ni mambo gani matatu aliyofanya siku ya saba?", "A. Akastarehe, Akaibariki, Akaitakasa.",
                    "B. Akalala usingizi, Akaamka, Akapaa mbinguni", "C. Akasema, \"Nimeumba mbingu, dunia na bahari\"", "4. Sabato ilitolewa " +
                    "kwa watu gani?", "A. Ilitolewa kwa wanadamu wote", "B. Ilitolewa kwa wayahudi tu", "C. Ilitolewa kwa watu wasiofanya " +
                    "kazi ofisini.", "5. Sabato ni siku gani ya juma?", "A. Ni siku ya Jumapili","B. Ni siku ya Jumamosi", "Ni " +
                    "siku ya Ijumaa", "AHADI: Baada ya kugundua kwamba Jumamosi ndiyo Sabato ya MUNGU, Je, kwa neema ya YESU ungependa kuitunza " +
                    "siku hiyo? (Kama \"Ndiyo\" tafadhali jaza jina lako hapa chini.)", "Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.", "MASWALI YA SOMO LA 18", "1. Sabato ni siku ya namna gani?",
                    "A. Ni siku ya furaha", "B. Ni siku ya huzuni", "C. Ni siku ya kufanya anasa zetu.", "2. " +
                    "MUNGU anawatakasa watu wa namna gani?", "A. Wanaoivunja Sabato", "B. Wanaoitakasa siku ya jumapili", "C. " +
                    "Wanaoitunza Sabato yake.", "3. Siku ya ijumaa inaitwaje katika Biblia?", "A. Inaitwa ijumaa kuu.", "B. Inaitwa " +
                    "siku ya maandalio", "C. Inaitwa Sabato.", "4. Mambo gani yafanywe siku ya Sabato?", "Kushona nguo na kufanya " +
                    "biashara", "B. Matendo mema, huruma, ibada, kuangalia viumbe.", "C. Kwenda ofisini, na shambani na kucheza mpira.",
                    "5. Je, MUNGU atawaruzuku wanaoitunza Sabato?", "A. La, atawaacha wafe na njaa.", "B. Wasiofanya kazi siku ya " +
                    "Sabato watapungukiwa.", "Ndiyo, hatawaacha wafe njaa.", "AHADI: Nimetambua na kuelewa kwamba Siku ya Sabato ni Siku " +
                    "takatifu ya MUNGU. Nitaitunza na kuitumia kuwa karibu na MUNGU wangu.", "Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.", "MASWALI YA SOMO LA 19", "A. Ni siku gani iliyo sabato ya kweli?",
                    "A. Sabato ya kweli ni Jumapili", "B. Sabato ya kweli ni Ijumaa", "C. Sabato ya kweli ni Jumamosi.",
                    "2. MUNGU anasemaje kwa wanaobadili sheria Yake?", "A. Anasema ibada yao ni ya bure.", "B. Anasema wana hekima nyingi.",
                    "C. Hasemi lo lote juu yao.", "3. Nani alibadili Sabato toka Jumamosi kwenda Jumapili?","A. YESU aliibadili baada ya " +
                    "kufufuka kwake.", "B. Paulo, Mtume wa Mataifa, ndiye aliyeibadili", "C. Kanisa la Katoliki la Rumi linadai lilibadili.",
                    "4. Je, Kuna fungu lolote katika Biblia linaounga mkono badiliko kama hilo?", "A. Hakuna hata fungu moja katika Biblia.",
                    "B. Mchungaji anasema yapo mafungu mengi", "C. Sijui, lakini nawaamini viongozi wangu wa kanisa kuliko Biblia.",
                    "5. Je, ni bora kushika amri za MUNGU kuliko za wanadamu?", "A. Ni bora kuwatii wanadamu wanaoonekana kuliko MUNGU.",
                    "B. Ni bora mno kuzishika ammri za MUNGU kuliko za wanadamu", "C. Itategemea mazingira niliyonayo.","AHADI: " +
                    "Kwa uwezo wa MUNGU na Neema yake, nitazishika Amri za MUNGU wangu.", "Jina: ", "Ingiza jina hapa", "Kumbuka kubonyeza kitufe " +
                    "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),
            new Questions("MUHIMU: Unaweza kutumia Biblia. Kwa kila swali kuna jibu moja tu lililo sahihi. Ndani ya viduara bonyeza " +
                    "kiduara chenye jibu sahihi zaidi.", "MASWALI YA SOMO LA 20","1. Kanisa la kweli ni lipi?", "A. " +
                    "Ni lile lililo na washiriki wengi mno.", "B. Ni lile lililo na washiriki wachache sana.", "C. Ni lile lifundishalo " +
                    "kweli yote kama ilivyo katika Biblia", "2. Kufuata dini ya wazazi hata kama wanapotea ni jambo jema?", "A. Ndio, ni vizuri " +
                    "kuwatii wazazi wangu.", "B. La, ni bora kumtii MUNGU kuliko wazazi wangu.", "C. Sitaacha dini ya wazazi wangu hata kama " +
                    "wakipotea.", "3. Makanisa yasiofundisha kweli yote yanaitwaje katika Biblia?", "A. Yanaitwa Babeli", "B. Yanaitwa " +
                    "Sodoma", "C. Yanaitwa makanisa ya MUNGU.", "4. Watu wa MUNGU waliomo Babeli wanapewa wito gani?", "A. Waendelee kukaa " +
                    "katika makanisa hayo.", "B. MUNGU anataka watoke humo upesi", "C. Watosheke na nuru ndogo waliyo nayo.", "5. Unaposikia " +
                    "sauti ya Bwana ikikuita ufanyeje?", "A. Uzibe masikio, usitoke Babeli.", "B. Utoke Babeli mara moja, ujiunge na kanisa la " +
                    "kweli.", "C. Ungoje mpaka mchungaji wako atakapogeuka.", "AHADI: Nimetambua ukweli. Napenda kubatizwa ili nijiunge na " +
                    "kanisa la kweli la MUNGU, linalofundisha kweli yote kama ilivyo katika Biblia.","Jina: ", "Ingiza jina hapa",
                    "Kumbuka kubonyeza kitufe " + "cha hapa chini kilichoandikwa \"KUSANYA\" mara baada ya kufanya maswali ili ulinganishe majibu yako na majibu sahihi.\n" +
                    "Ubarikiwe sana.", "Kusanya"),

    };

    //the constructor
    private Questions(String muhimu, String maswali_ya_somo_la, String kwanza, String kwanza_A, String kwanza_B,
                      String kwanza_C, String pili, String pili_A, String pili_B, String pili_C, String tatu,
                      String tatu_A, String tatu_B, String tatu_C, String nne, String nne_A, String nne_B,
                      String nne_C, String tano, String tano_A, String tano_B, String tano_C, String ahadi_Text,
                      String jina_Label, String jina_TextField, String kumbuka_Text, String kusanya) {

        this.muhimu = muhimu;
        this.maswali_ya_somo_la = maswali_ya_somo_la;
        this.kwanza = kwanza;
        this.kwanza_A = kwanza_A;
        this.kwanza_B = kwanza_B;
        this.kwanza_C = kwanza_C;
        this.pili = pili;
        this.pili_A = pili_A;
        this.pili_B = pili_B;
        this.pili_C = pili_C;
        this.tatu = tatu;
        this.tatu_A = tatu_A;
        this.tatu_B = tatu_B;
        this.tatu_C = tatu_C;
        this.nne = nne;
        this.nne_A = nne_A;
        this.nne_B = nne_B;
        this.nne_C = nne_C;
        this.tano = tano;
        this.tano_A = tano_A;
        this.tano_B = tano_B;
        this.tano_C = tano_C;
        this.ahadi_Text = ahadi_Text;
        this.jina_Label = jina_Label;
        this.jina_TextField = jina_TextField;
        this.kumbuka_Text = kumbuka_Text;
        this.kusanya = kusanya;

    }

    //adding the getters methods
    public String getMuhimu() {
        return muhimu;
    }

    public String getMaswali_ya_somo_la() {
        return maswali_ya_somo_la;
    }

    public String getKwanza() {
        return kwanza;
    }

    public String getKwanza_A() {
        return kwanza_A;
    }

    public String getKwanza_B() {
        return kwanza_B;
    }

    public String getKwanza_C() {
        return kwanza_C;
    }

    public String getPili() {
        return pili;
    }

    public String getPili_A() {
        return pili_A;
    }

    public String getPili_B() {
        return pili_B;
    }

    public String getPili_C() {
        return pili_C;
    }

    public String getTatu() {
        return tatu;
    }

    public String getTatu_A() {
        return tatu_A;
    }

    public String getTatu_B() {
        return tatu_B;
    }

    public String getTatu_C() {
        return tatu_C;
    }

    public String getNne() {
        return nne;
    }

    public String getNne_A() {
        return nne_A;
    }

    public String getNne_B() {
        return nne_B;
    }

    public String getNne_C() {
        return nne_C;
    }

    public String getTano() {
        return tano;
    }

    public String getTano_A() {
        return tano_A;
    }

    public String getTano_B() {
        return tano_B;
    }

    public String getTano_C() {
        return tano_C;
    }

    public String getAhadi_Text() {
        return ahadi_Text;
    }

    public String getJina_Label() {
        return jina_Label;
    }

    public String getJina_TextField() {
        return jina_TextField;
    }

    public String getKumbuka_Text() {
        return kumbuka_Text;
    }

    public String getKusanya() {
        return kusanya;
    }

    public String toString() {
        return this.maswali_ya_somo_la;
    }

}
