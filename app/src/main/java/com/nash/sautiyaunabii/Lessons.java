package com.nash.sautiyaunabii;

/**
 * This is the class for all the lessons in the Roho ya Unabii App
 * It's intended to be used by various activities and fragments in the entire app
 * Pls, consider updating this app whenever an updates becomes available via the app store
 * <p>
 * <p>
 * Developer: Enosy, Nashon Gama
 * Date: Monday, May 25th, 2020
 */

public class Lessons {
    private String title;
    private String description;
    private String content;
    //private String maswali; //the button to be implemented in version 2

    public static final Lessons[] lessons = {
            new Lessons("Somo la 1", "Je, MUNGU Ana Mpango Gani na Watu Wake?",
                    "Fungu la Kukariri: \"Kwa kuwa ndiwe uliye mkuu, wewe ndiwe mfanya miujiza, ndiwe MUNGU peke yako.\" Zaburi 86:10\n\n" +
                            "UTANGULIZI\n" +
                            "Tangu anguko la mwanadamu, MUNGU amekuwa akitafuta kumvuta mwanadamu aone hatari inayomkabili. Yeremia aliandika, " +
                            "\"Bwana alinitokea zamani,  akisema, Nami nimekupenda kwa upendo wa milele ndio maana nimekuvuta kwa fadhili zangu\" " +
                            "(Yeremia 31:3). Lengo la MUNGU ni kumwokoa mwanadamu (Rumi 2:4) na ni MUNGU mwenyewe anayechukua jukumu la kurudisha " +
                            "uhusiano uliovunjika (2Kor. 5: 19)\n" +
                            "Lakini katika mpango huu wa MUNGU wa kumwokoa mwanadamu, mwanadamu naye anayo sehemu ya kufanya ili aokolewe." +
                            "MUNGU anasema \"Niangalieni mimi muokolewe enyi ncha zote za dunia, maana mimi ni MUNGU; hapana mwingine (Isaya 45: 22)\" " +
                            "sehemu ya mwanadamu katika kuokolewa kwake ni KUMWANGALIA MUNGU mtawala mkuu wa dunia yote. Wakati wanadamu wengine " +
                            "wanapodharau uwepo wa MUNGU, kwako hii iwe ni nafasi yako ya kujifunza kwa bidii na uaminifu siri zilizofichika katika " +
                            "NENO lake.\n\n" +
                            "1. Ni Watu Wa Namna Gani Ambao Hawaamini Kwamba Yuko MUNGU?\n" +
                            "Wako watu wengi wanaokataa kuamini kwamba yuko MUNGU. Husema, \"pengine yuko, bali hatujui.\" Watu wa namna hii " +
                            "wangalihurumiwa kwa sababu katika Zaburi 53:1 twasoma kuwa mtu anayekosa akili anasema moyoni mwake, \"Hakuna " +
                            "MUNGU.\" Ni lazima bila shaka awepo MUNGU mmoja.\n" +
                            "Watu wengine, wanaamini kuwepo kwa miungu wengi. Hebu tusome asemavyo MUNGU huyu mmoja juu ya miungu hawa wengi.\n" +
                            "\"Mtanifananisha na nani, na kunisawazisha naye, ama kunilinganisha naye, ili tuwe sawasawa? Watu wamwagao dhahabu " +
                            "kutoka mfukoni, na kupima fedha katika mizani, huajiri mfua dhahabu akifanya mungu: huanguka naam, huabudu, " +
                            "humchukua begani, humchukua, wakamsimamisha mahali pake, akasimama: hataondoka katika mahali pake, naam, mmoja atamwita " +
                            "lakini hawezi kujibu, wala kumwokoa na taabu yake.\" \"Kumbukeni mambo ya zamani za kale maana mimi ni MUNGU wala " +
                            "hapana mwingine; Mimi ni MUNGU, wala hapana aliye kama mimi\" Isaya 46: 5-7 na 9\n\n" +
                            "2. Je, Tunajifunza Nini Kutokana Na Mafungu Haya?\n" +
                            "(a) Yawezekana kuwako miungu wengi popote katika ulimwengu huu kwa kadiri watu wapendavyo kuifanya, toka dhahabu, fedha, " +
                            "miti, na toka kitu kingine kiwacho chote; lakini (b) watu hawa wanaweza kumchukua mungu huyo mahali popote, ama " +
                            "kumsimamisha naye hawezi hata kidogo kuondoka toka mahali pake (c) hawezi kuwasikia wasemapo naye, ama (d) kuwaokoa na " +
                            "taabu zao. Je, huyo mungu ana faida?\n\n" +
                            "3. Je, Kuna Miungu Zaidi ya Mmoja?\n" +
                            "Katika Isaya 45: 22 twasoma: Mimi ni MUNGU; hapana mwingine. Kumbe!\n Hata hivyo twafanya makosa tuziitapo  sanamu hizi " +
                            "miungu, sanamu hizi zilizofanywa na watu ikiwa huyo MUNGU mmoja asema hakuna MUNGU mwingine ila Yeye. Kweli, tunaweza " +
                            "kusema juu yao kuwa ni miungu kumbe ni sanamu zisizoweza kusaidia. \"Kwa maana ijapokuwa wako waitwao miungu ... lakini " +
                            "kwetu sisi MUNGU ni mmoja tu.\" 1Korintho 8:5,6. \"Mimi ni wa kwanza, na mimi wa mwisho; zaidi yangu mimi hapana MUNGU\" " +
                            "Isaya 44:10. Ni nani aliyejichongea mungu mmoja, ama aliyesubu sanamu isiyofaa kitu? Katika mafungu 14-17 ya sura hii " +
                            "twaambiwa ya kwamba, mtu huukata mti na kuitumia sehemu nyingine ya mti huo kupika mkate, kuokea nyama, na kuota; " +
                            "na katika sehemu nyingine ya mti huo huo, huufanya mungu wa kuabudu. Humwita mungu, huyu aliyemfanya mwenyewe amwokoe. Bali " +
                            "Isaya asema nini juu ya mungu aliyefanywa na mtu? \"Hawezi kujibu, wala kumwokoa na taabu yake\"\n\n" +
                            "4. Ni udhaifu gani wa miungu ifanywayo na watu?\n" +
                            "\"Hawana maarifa wale wachukuao mti wa sanamu yao ya kuchonga. Wamwombapo mungu asiyeweza kuokoa.\" Isaya 45:20\n\n" +
                            "" +
                            "YUKO MUNGU MMOJA, NAYE NI ROHO\n" +
                            "5. Ni Nani Pekee Awezaye Kuwa MUNGU wa kweli?\n" +
                            "Maneno ya kwanza kabisa katika Biblia yasema: \"Hapo mwanzo MUNGU aliziumba mbingu na nchi\" Mwanzo 1:1.\n" +
                            "Toka maneno haya, inatupasa tufahamu ya kwamba MUNGU alikuwako kabla ya kuumbwa dunia, hivyo haiwezekani kuwa yeye " +
                            "aliumbwa na mtu.\n" +
                            "Je, MUNGU huyo mmoja anafurahia mtu ajifanyie miungu wasioweza kusaidia?\n" +
                            "\"Usijifanyie sanamu ya kuchonga, wala mfano wa kitu chochote kilicho juu mbinguni, wala kilicho chini duniani, wala " +
                            "kilicho majini chini ya dunia. Usivisujudia wala kuvitumkia kwa kuwa, Mimi BWANA MUNGU wako, ni MUNGU mwenye wivu " +
                            "nawapatiliza wana maovu ya baba zao, hata kizazi cha tatu na cha nne cha wanichukiao, nami nawarehemu maelfu na maelfu " +
                            "wanipendao, na kuzishika amri zangu.\" Kutoka 20:4-6\n" +
                            "Yesu alisema kwa yule mwanamke msamaria, \"Nanyi mnaabudu msichokijua; sisi tunaabudu tukijuacho; MUNGU ni Roho nao " +
                            "wamwabuduo yeye imewapasa wamwabudu katika roho na kweli\" Yohana 4:22-24\n" +
                            "Toka mafundisho haya twaweza kuona ya kwamba kuna MUNGU mmoja tu... Muumbaji wa mbingu na dunia, ambaye kwa hivyo, ni lazima " +
                            "awe aliishi kabla ya kuwako kwa dunia; bali ziko sanamu nyingi sana zisizoweza kusaidia ziitwazo miungu, zisizoweza " +
                            "kusikia wala kuokoa\n\n" +
                            "" +
                            "TABIA YA MUNGU\n" +
                            "6. Twaweza kujua nini juu ya tabia ya MUNGU?\n" +
                            "Huyu MUNGU mmoja, ni MUNGU wa namna gani? Je, ni mkali? Je, ni mwenye hasira? Je, ni mwenye huruma, upendo na mwenye rehema? " +
                            "\"MUNGU ni mwenye huruma, mwenye fadhili, si mwepesi wa hasira.\" Kutoka 34:6,7 \"Mungu ni pendo.\" 1Yohana 4:8.\n" +
                            "7. Je, MUNGU huyu mmoja, anatuambia kweli ama anatuambia uongo?\n" +
                            "\"BWANA, BWANA MUNGU mwingi wa huruma, mwenye fadhili, si mwepesi wa hasira, mwingi wa rehema na kweli\" Kutoka 34:6. \"Lakini " +
                            "Wewe u MUNGU, uliye tayari kusamehe, mwenye neem, mwenye huruma nyingi, si mwepesi wa hasira u mwingi wa rehema\" Nehemia 9:17\n" +
                            "8. Je, MUNGU huyu mmoja ni dhaifu ama ni mwenye nguvu?\n" +
                            "\"Kwa maana BWANA MUNGU aliye mhukumu ni mwenye nguvu.\" Ufunuo 18:8; \"BWANA mwenye nguvu, hodari " +
                            "wa vita\" Zaburi 24:8\n\n" +
                            "MWANADAMU AMEPATA KUMWONA MUNGU?\n" +
                            "9. Kuna mtu aliyemwona MUNGU?\n" +
                            "\"Hakuna mtu aliyemwona MUNGU wakati wowote.\" 1Yohana 4:12. Kwa sababu hakuna aliyemwona MUNGU, wengi wanashaka " +
                            "ya kwamba yuko.\n" +
                            "Tunasoma katika Zaburi 19:1-3, \"Mbingu zahubiri utukufu wa MUNGU, na anga laitangaza kazi ya mikono yake. Mchana " +
                            "husemezana na mchana, usiku hutolea usiku maarifa. Hakuna lugha wala maneno, sauti yao haisikilikani.\"\n" +
                            "10. MUNGU amesema na watu wa dunia hii kwa namna gani?\n" +
                            "Zamani kabla ya dhambi kuingia ulimwenguni, MUNGU alikuwa akizungumza na watu aliowaumba uso kwa uso. Waliweza " +
                            "kumwona Muumba wao na kuzungumza Naye kama tunavyoweza kuzungumza na rafiki. Twaona maneno yaoneshayo kuwa MUNGU " +
                            "alikuwa akija na kuzungumza na Adam katika Mwanzo 3:8-10. \"Kisha wakasikia sauti ya BWANA MUNGU akitembea bustanini " +
                            "wakati wa jua kupunga; Adam na mkewe wakajificha... BWANA MUNGU asiwaone. BWANA MUNGU akamwita Adam, akamwambia, " +
                            "Uko wapi? Akasema, nalisikia sauti yako bustanini nikaogopa.\" Ukiendelea na sura hiyo utaona kuwa yalikuwap " +
                            "mazungumzo.\n" +
                            "Dhambi ilipozidi, MUNGU alitafuta namna nyingine za kuzungumza na watu, kwa njia ya manabii. Waebrania 1:1\n" +
                            "Baadaye alimtuma YESU ambaye amemdhihirisha Baba kwa wanadamu waliopotea dhambini. Waebrania 1:2. Baada ya kufa " +
                            "na kufufuka kwake, YESU aliwaahidi wanafunzi wake Roho Mtakatifu. Yohana 14: 16-17: \"Nami nitamwomba Baba, naye " +
                            "atawapa msaidizi mwingine, ili akae nanyi hata milele.. Ndiye Roho wa kweli.\" Kutimizwa kwa ahadi hii kunaonekana " +
                            "katika Matendo sura ya 2.\n\n" +
                            "TU WATU WA MUNGU.\n" +
                            "11. Je, ni haki gani kuu ambayo Biblia inafundisha juu ya uhusiano wa MUNGU na wanadamu?\n" +
                            "YESU aliwafundisha wanafunzi wake kuomba \"Baba yetu\" hivyo MUNGU ni lazima awe Baba yetu pia. Na kama ni Baba yetu, " +
                            "TU WATOTO WAKE. Mathayo 6:9; Malaki 2:10\n" +
                            "12. Ni mwaliko gani wa ajabu MUNGU anaoutoa kwa watu wake?\n" +
                            "Zaburi 50:15; \"Uniite siku ya mateso, nitakuokoa na wewe utanitukuza.\"\n" +
                            "Zaburi 4:3; \"BWANA atanisikia nimwitapo.\"\n" +
                            "Baba wa kidunia hufurahi ikiwa watoto wake husema nao. Si Kwamba wakiwa katika taabu tu, bali kila wakati. Hivyo, Baba " +
                            "yetu wa mbinguni anapenda watoto wake wazungumze naye juu ya furaha zao zote, mashaka yao na mahitaji yao pia. Kweli " +
                            "anatusaidia tuwapo katika shida, lakini tungekuwa na kawaida ya kusema naye mara kwa mara kila siku, kwa sababu twampenda. " +
                            "Hiyo ndiyo njia  ya Neno lake, kwa Roho Mtakatifu, na kwa njia ya vitu alivyoviumba tuvionavyo kila upande. (soma Zaburi 19:1-3).\n\n"
                    /*"Maswali ya Somo la 1"*/),
            new Lessons("Somo la 2", "Je, Asili ya Mwanadamu ni Nyani?",
                    "Fungu la Kukariri: \"Hapo mwanzo MUNGU aliziumba mbingu na nchi.\" Mwanzo 1:1. \"MUNGU akaumba mtu kwa mfano wake.\" Fungu la 27\n\n" +
                            "UTANGULIZI\n" +
                            "Bwana Charles Darwin ana sifa ya kuwa muasisi wa mawazo ya uibukaji kwamba wanadamu walitokana na wanyama, maana " +
                            "ndiye aliyeandika kitabu kinachoitwa \"Origin of Species\" mnamo karne ya kumi na tisa. Lady Hope alikuja kumsalimu " +
                            "bwana Darwin alipokuwa mgonjwa hajiwezi kitandani. Kumbe, aliona mgonjwa alikuwa akisoma Biblia. \"Tafadhali, Mama,\" " +
                            "bwana Darwin alisema, \"Niitie watu wa nyumbani mwangu leo saa tisa uwahubiri injili, na mimi nitakuwa nikisikiliza " +
                            "nikiwa nimelala hapa kitandani.\" Mama Hope alishtuka, akamuuliza, \"Je, utafanyaje kuhusu yale maandiko yako?\"" +
                            "Bwana Darwin alijibu, \"Mimi nilitoa mawazo yasiyoweza kuthibitishwa, na nilishtuka kuona kumbe dunia yote waliyapokea " +
                            "maneno yangu. Lakini sasa ninasoma maneno ya Mfalme.\" Hapo aliinua Biblia yake. Basi mama huyu aliwakusanya wote waliotajwa, " +
                            "na kuwahubiri injili sawasawa na ombi la Mzee Darwin.\n\n" +
                            "" +
                            "1. Je, Ulimwengu uliumbwa kutokana na nini?\n" +
                            "Kulikuwa na wakati ambapo hapakuwa na nchi. Kumbukumbu la Torati 33:27:\"MUNGU ... makazi yako.\" Yapo " +
                            "malimwengu mengine vilevile. Na hata kabla ya hayo pia, MUNGU alikuwako. Kwani twasoma katika Waebrania 1:1,2; " +
                            "\"MUNGU ... mwisho wa siku hizi amesema na sisi katika Mwana ... tena kwa Yeye aliufanya ulimwengu.\" Na katika " +
                            "Waebrania 11:3; \"Ulimwengu uliumbwa kwa Neno la MUNGU.\"\n" +
                            "Mwanadamu anaweza kufanya vitu vingi vya kustaajabisha, bali si kama MUNGU. Mwanadamu hawezi kufanya kitu bila " +
                            "kutumia malighafi ya vitu vilivyoumbwa. Bali MUNGU aliumba ulimwengu pasipo kutumia kitu chochote, alisema na " +
                            "ikawa. Awezaje mwanadamu kuelewa jambo hili?\n" +
                            "Hawezi kuelewa, bali kuamini. Je, mbwa, mbuzi ama kuku wako waweza kuelewa jinsi uwezavyo kuijenga nyumba yako? " +
                            "Je, wanaweza kukusaidia kulipanda shamba lako? La, kwa sababu si wanadamu. Wanyama hawawezi kuelewa mambo " +
                            "mengi MUNGU awezayo kuyafanya \"Maana yote yawezekana kwa MUNGU\" Marko 10:27, \"Yasiyowezekana kwa wanadamu " +
                            "yawezekana kwa MUNGU.\" Luka 18:27.\n\n" +
                            "JE! YESU ALIISHI KABLA HAJAZALIWA KULE BETHLEHEMU KAMA MTOTO MCHANGA?\n\n" +
                            "2. Ni kwa namna gani Mwana alimsaidia Baba katika uumbaji?\n" +
                            "\"MUNGU ... mwisho wa siku hizi amesema na sisi katika Mwana... tena kwa yeye aliufanya ulimwengu.\" Waebrania 1:1,2 " +
                            "Wakolosai 1:13-16 (Husema juu ya mwana): \"Kwa kuwa juu ya nchi... vitu byote viliumbwa kwa njia yake.\" Waefeso 3:9. MUNGU " +
                            "aliyeumba vitu vyote (Kwa njia ya YESU Kristo) (angalia Tafasiri ya Zanzibar) kwa kuvisoma vifungu hivi, twaona ya kwamba " +
                            "YESU Kristo, yule Mwana, alikuwa Muumbaji akishirikiana na Baba.\n\n" +
                            "3. Roho Mtakatifu naye, alimsaidiaje Baba katika kazi ya uumbaji?\n" +
                            "Mwanzo 1:2; \" Roho ya MUNGU ikatulia juu ya uso wa maji.\" Ayubu 33:4; \"Roho ya MUNGU imeniumba.\" Kutokana na mafungu haya, " +
                            "twaona ya kwamba Roho Mtakatifu naye pia alishirikiana na Baba katika mchakato wa uumbaji\n\n" +
                            "JE, UUMBAJI ULITUMIA MIAKA MAMILIONI?\n" +
                            "4. Je, juma lile ambalo MUNGU alilitumia katika kuumba ulimwengu ni sawa na juma tulilo nalo sasas?\n" +
                            "Katika sura hii ya kwanza ya Biblia, tunakutana na kisa cha uumbaji. Mwanzo 1:1. Katika sura hii twapata kila kilichofanywa " +
                            "katika kila siku. Pia twaona ya kuwa ulimwengu na vitu vyote vilivyomo viliumbwa kwa muda wa JUMA MOJA TU. Kwanza mwanga ulifanywa, " +
                            "kisha anga, kisha miti na nyasi, kisha jua na mwezi, viumbe viogeleavyo navyo virukavyo, kisha wanyama, na mwisho wa vyote MTU. Katika " +
                            "fungu la 16 la sura hii, twaambiwa ya kwamba, MUNGU \"akafanya na nyota pia.\" Watu wengi wanataka tuamini " +
                            "ya kwamba kila siku ya uumbaji zilikuwa ni muda wa miaka milioni, bali hii haiwezekani, kwani katika Mwanzo " +
                            "mlango wa kwanza twasoma kila kilichofanywa kila siku, na baada ya kila kazi ya kila siku, twapata maelezo " +
                            "haya: \"Ikawa jioni ikawa asubuhi, siku moja.\" Basi jioni na asubuhi nyingine ikawa siku ya pili, ikaendelea " +
                            "vivyo hivyo mpaka juma zima likatimia. Hivyo ni siku hasa kama siku zilivyo sasa - giza na mwanga. Sasa, kama " +
                            "MUNGU alifanya nyasi na miti katika siku ya tatu, halafu kama vingeendelea kuwa gizani kwa miaka milioni nyingi, " +
                            "miti na nyasi hizo vingeishi namna gani? kila mmoja ambaye amefanya kazi ya kulima shamba anajua kwamba kama nyasi na " +
                            "mimea mingine vikikuzwa hata mahali pa kuvuli kwa muda fulani tu, vitadhoofika na kufa.\n" +
                            "Je vipi miaka milioni nyingi ya giza? Jambo hilo haliwezekani kabisa! Na pia katika siku ya nne MUNGU alifanya mianga " +
                            "miwili mikubwa, mwanga mkubwa kuutawala mchana, na mwanga mdogo kuutawala usiku (Jua na mwezi). (Angalia fungu la 16). Je, " +
                            "ni nani amekwisha kusikia habari za jua kuwaka kwa miaka milioni nyingi na kisha mwezi nao uwake kwa muda wa miaka mingi " +
                            "nama ile? Mwanadamu anahitaji mwanga wa jua kwa ajili ya kudumisha uhai wake. Je, angeweza kweli kuishi kwa miaka nyingi " +
                            "katika giza? La!. Ni vyema sana kuliamini Neno la MUNGU kama linavyosema kuliko kubuni mawazo yasiyo na busara namna hii. " +
                            "Siku sita tu zilitumiwa katika kuufanya ulimwengu huu - siku zilizo na urefu sawa kabisa na siku hizi tulizo nazo sasa\n\n" +
                            "5. Kuna uthibitisho gani kwamba asili ya mtu si nyani au mnyama mwingine yeyote yule?\n" +
                            "Wengi wanataka tuamini ya kwamba: \"Mwanadamu alianza kama mfano wa maisha ya mmea mdogo, kisha akafikia maisha ya mnyama " +
                            "fulani na baada ya miaka milioni nyingi, akawa mtu.\" Mawazo mengine yasiyo ya busara ya wale wasiokubali kumwamini MUNGU " +
                            "katika Neno lake ndiyo haya! Je Biblia yasema nini? \"MUNGU akaumba mtu kwa mfano wake, kwa mfano wa MUNGU aliwaumba.\" Mwanzo 1:27, " +
                            "tena, \"Bwana MUNGU akamfanya mtu kwa mavumbi ya ardhi, akampulizia puani pumzi ya uhai; mtu akawa nafsi hai.\" Mwanzo 2:7. Kamwe " +
                            "Mwanadamu hakupitia hatua ya mnyama mwingine kabla ya kuwa mtu. Alikuwa mtu toka mwanzo wa kuishi kwake.\n\n" +
                            "6. Ni njia gani ya ajabu mwanamke wa kwanza aliumbwa?\n" +
                            "Katika Mwanzo 2:21,22; twasoma ya kwamba: \"Bwana MUNGU akamletea Adamu usingizi mzito, naye akalala,\" na alipokuwa amelala, " +
                            "\"akatwaa ubavu wake mmoja,\" na toka ubavu huu \"Bwana MUNGU akaufanya mwanamke,\" Hawa.\n\n" +
                            "7. Je, ni kitu gani kilichofanywa katika siku ya saba?\n" +
                            "Mimea yote na wanyama na mwanadamu vilifanywa kwa muda wa siku sita. Je, MUNGU alifanya nini katika siku ya saba ya juma lote. Na " +
                            "siku ya saba MUNGU alimaliza kazi yake yote aliyoifanya. MUNGU AKAIBARIKI siku ya saba, AKAITAKASA kwa sababu katika siku hiyo " +
                            "MUNGU ALISTAREHE akaacha kufanya kazi yake yote aliyoiumba na kuifanya.\" Mwanzo 2:1-3.\n" +
                            "Ikiwa MUNGU alijua ya kwamba mwanga, hewa, mimea na miti na wanyama ni vitu ambavyo mwanadamu anavihitaji, ni lazima tuseme vilevile " +
                            "ya kwamba mwanadamu anahitaji siku hii ya mapumziko.\n\n" +
                            "JE, MUNGU ALIKUSUDIA TUTOSHEKE NA KUFURAHI KATIKA ULIMWENGU HUU?\n" +
                            "8. Je, MUNGU alikuwa na kusudi gani katika kuufanya ulimwengu huu?\n" +
                            "Toka somo la kwanza tulijufunza ya kwamba wanadamu ni watoto wa MUNGU. Kwa hivyo mtu wa kwanza aliefanywa, alikuwa mtoto wa MUNGU, " +
                            "alimwambia, \"Zaeni, mkaongezeke, mkaijaze nchi.\" Mwanzo 1:28\n\n" +
                            "MUNGU alipanga ya kwamba dunia ijazwe na watoto Wake. \"Maana Bwana, aliyeziumba mbingu, asema hivi; Yeye ni MUNGU, " +
                            "ndiye aliyeiumba dunia na kuifanya; ndiye aliyeifanya imara; hakuiumba ukiwa. Aliiumba ili ikaliwe na watu.\" Isaya 45:18. " +
                            "MUNGU alikusudia mwanadamu aishi katika bustani na kuitunza. Mwanzo 2:8,15. \"Bwana MUNGU akamweka ndani yake huyo mtu aliyemfanya ..." +
                            "Bwana MUNGU akamtwaa huyo mtu; akamweka katika bustani ya  Edeni, ailime na kuitunza.\"\n\n" +
                            "Kama watoto wangeongezeka yaani wanadamu hivyo hivyo vilevile hesabu za bustani za kuwatunza zingeongezeka pia. Mwanzo 2:9 \"Bwana MUNGU " +
                            "akachipusha katika ardhi kila mti unaotamanika kwa macho na kufaa kuliwa.\" MUNGU alimwandalia kila kitu mwanadamu alichohitaji cha " +
                            "kumfurahisha. Alikusudia afanye kazi ya kuitunza bustani ile, kwani kazi ni mbaraka kwa mwanadamu. Kifungu cha 19 na cha 20 vyatuambia ya " +
                            "kwamba, \"Ukatoka mto katika Edeni wa kuitilia bustani maji.\" Kifungu cha 19 na cha 20 vyatuambia ya kwamba kulikuwa na ndege na wanyama " +
                            "wa namna nyingi. Kweli, MUNGU aliandaa mazingira mema kwa watoto Wake. Kila alichokifanya MUNGU kilikuwa \"chema\" (chema sana). Basi " +
                            "ni nani aliyeleta magonjwa, taabu, njaa, umaskini? Hii ni kazi ya adui wa MUNGU yaani shetani.\n\n"
                    /*"Maswali ya Somo la 2"*/),
            new Lessons("Somo la 3", "MUNGU Atoa Kitabu Kuwaongoza Watoto Wake",
                    "Fungu la Kukariri: \"Neno Lako ndiyo KWELI\" Yohana 17:17.\n\n" +
                            "UTANGULIZI.\n" +
                            "Mtu anunuapo kitu, kama vile kompyuta, cherehani, ama pengine motokaa, hupewa pia na kitabu cha mwongozo. Kitabu hiki kina maelekezo " +
                            "yote, humwambia mnunuzi huyu jinsi ya kukitumia kitu kile alichokinunua ili kimfaidie kwa muda mrefu. Mtu huyo ayafuatapo maelezo ya " +
                            "kitabu kile, atakifaidi kitu hicho, nacho kitadumu kwa siku nyingi. Bali asipoyafuata maelekezo ya kitabu kile, kitu kile chaweza kuvunjika " +
                            "kikawa hakina faida tena. Je, ni nani wa kulaumiwa katika jambo hili? Aliyeuza kompyuta, cherehani, ama motokaa? La, Ni huyu mtu " +
                            "aliyekinunua hicho kitu ndiye wa kulaumiwa, kwa sababu amekataa kufuata maelekezo yaliyotolewa katika kitabu kile cha mwongozo!\n" +
                            "Na MUNGU vilevile ametoa kitabu kama kicho, kitabu cha mwongozo, BIBLIA, pia  kijulikanacho kama \"NENO LA MUNGU\" na \"" +
                            "MAANDIKO MATAKATIFU.\" Na kwa sababu twamwamini MUNGU wetu na katika Hekima Yake, twaamini ya kwamba twaweza kukitegeme " +
                            "kitabu chake katika kutupatia mwongozo ulio sahihi\n\n" +
                            "MUNGU ALIMTAYARISHIA MWANADAMU KITABU CHAKE\n" +
                            "1. Je, MUNGU alikitayarishaje kitabu chake cha maelezo?\n" +
                            "\"Kila andiko, lenye pumzi ya MUNGU, lafaa kwa mafundisho, ...ili mtu wa MUNGU awe kamili.\" 2Timotheo 3:16-17. \"Mkijua neno " +
                            "hili kwanza ya kwamba hakuna unabii katika maandiko upatao kufasiriwa kama apendavyo mtu fulani tu. Maana unabii haukuletwa popote kwa " +
                            "mapenzi ya mwanadamu, bali wanadamu waliyanena yaliyotoka kwa MUNGU wakiongozwa na ROHO MTAKATIFU.\" 2Petro 1:20,21. Je, vifungu hivi vyatuambia " +
                            "ya kwamba mtu ama kikundi cha watu kilikusudia kukiandika kitabu na kukiita kitabu cha MUNGU? La! Vyatuambia ya kwamba Maandiko Matakatifu " +
                            "yalitolewa na MUNGU kwa nyia ya Roho Mtakatifu, na ya kwamba, watu hawa waliandika kama Roho Mtakatifu alivyowaongoza. Mmoja aliandika " +
                            "kwa namna fulani, na mwingine akaandika kwa namna tofauti vile vile, bali alikuwa ni MUNGU ambaye, kwa Roho Mtakatifu, aliwaonesha uale " +
                            "waliyoyaandika.\n\n" +
                            "2. Je, KRISTO alipokuwa katika ulimwengu aliyaamini yale ambayo manabii waliyaandika?\n" +
                            "\"Akawaambia, Enyi msiofahamu, wenye mioyo mizito ya kuamini yote waliyoyasema manabii!... akaanza kutoka Musa na manabii wote " +
                            "akawaeleza katika maandiko yote mambo yaliyomhusu Yeye mwenyewe.\" Luka 24:25,27.\n" +
                            "Ikiwa KRISTO aliyaamini yote yaliyoandikwa na manabii, Maandiko Matakatifu, iweje basi sisi tusiyaamini?\n\n" +
                            "3. Biblia ina nini ndani yake?\n" +
                            "Biblia ina Agano la Kale na Agano Jipya. Kuna vitabu 39 katika Agano la Kale, na 27 katika Agago Jipya. Hufanya jumla ya vitabu 66 " +
                            "" +
                            "katika Biblia nzima. Vitabu hivi viliandikwa na watu wapatao 40. Wengine kati ya waandishi hao walikuwa ni wafalme wengine walikuwa wana " +
                            "wa wafalme, wengine wakulima na wengine mawaziri, wengine wavuvi, kulikuwa na mtoza ushuru, mchungaji; wengine matajiri, wengine " +
                            "maskini, wengine walioelimika sana, na wengine wenye elimu haba tu, bali wote walitumiwa na MUNGU kukitayarisha Kitabu Chake kwa " +
                            "ajili ya watoto Wake. Mwanadamu asingeweza kuyatoa majawabu mengi ya maswali yaliyojibiwa katika Biblia -NENO LA MUNGU. Vitabu " +
                            "hivi viliandikwa kwa muda wa takriban miaka 1600 chini ya hali na jinsi mbalimbali na kama tulivyokwisha kusema: na namna mbalimbali " +
                            "za watu, bali maandiko yote yanapatana. Hilo ni moja ya shuhuda kubwa kuonesha ya kwamba Biblia yote ilitolewa na MUNGU, kwa sababu wanadamu " +
                            "hawapatani katika yale wanayoyaandika. Agano Jipya liliandikwa baada ya Kristo kuja hapa ulimwenguni. Liliandikwa na wanafunzi wake. " +
                            "Wanafunzi hawa walinukuu maneno ya Agano la Kale zaidi ya mara 260, hivyo twajua ya kwamba waliyaamini Maandiko Matakatifu ya Agano " +
                            "la Kale kama Kristo alivyoyaamini. \"Mpate kuyakumbuka yale maneno haliyonenwa zamani na manabii watakatifu na ile amri ya Bwana " +
                            "na Mwokozi iliyoletwa na mitume wenu.\" 2Petro 3:2.\n\n" +
                            "UWEZO WA KITABU CHA MUNGU\n" +
                            "\"Maana NENO LA MUNGU li hai, tena lina nguvu.\" Waebrania 4:12\n\n" +
                            "4. Kitabu cha MUNGU, kinamfaidia nini mwanadamu?\n" +
                            "(a) Kitampatia hekima iliyo lazima kwa wokovu, mafundisho ya kufaa kuonya makosa, kuongoza, kuadibisha katika haki. 2Timotheo 3:15,16. " +
                            "(b) Kitampatia uvumilivu, faraja, tumaini. Warumi 15:4.\n" +
                            "(c) Kitampa mwanga katika maisha yake. Zaburi 119:105. \"Neno lako ni taa ya miguu yangu, na mwanga wa njia yangu\"" +
                            "(d) Kinatoa uzima. Yohana 6:63; \"Maneno hayo niliyowaambia ni roho tena ni UZIMA.\"\n\n" +
                            "5. Je, Neno la MUNGU latwambia kuhusu yale yatakayotokea siku za usoni?\n" +
                            "MUNGU ajua mwisho toka mwanzo. Isaya 46:9,10; \"Mimi ni MUNGU wala hapana mwingine; Mimi ni MUNGU wala hapana aliye kama MIMI, nitangazaye " +
                            "mwisho tangu mwanzo, na tangu zamani za kale mambo yasiyotendeka bado.\" UNABII WA BIBLIA ni uthibitisho kuonesha kwamba Biblia ni " +
                            "Neno la MUNGU. Mambo mengi yalitabiriwa katika Biblia kwa miaka mia ama elfu nyingi kabla ya utimilizo wake.\n" +
                            "(a) MUNGU alijua ya kwamba mioyo ya watu ingejawa na hofu na ya kwamba mataifa yatapigana. Luka 21:25,26.\n" +
                            "(b) MUNGU alijua ya kwamba kungekuwa na uhalifu mwingi wa sheria na ubaya mwingi, na akatoa sababu yake. (2Timotheo 3:1-5, Isaya 24:5). " +
                            "Mafungu hayo husema kwamba sababu yake ni kwa kuwa watu wameiasi njia ya MUNGU.\n" +
                            "(c) MUNGU alikwisha kujua kuwa patakuwa na uvumbuzi wa ajabu siku hizo. Dan. 12:4... \"Maarifa yataongezeka\"\n" +
                            "(d) MUNGU alijua tangu hapo kuwa patakuwako na utaratibu wa ajabu wa umishenari ambao kwao neno lake litaenezwa kwa watu wa mataifa yote. " +
                            "Math. 25:14.\n\n" +
                            "KITABU CHA MUNGU KINAWAHUSU WATU WOTE.\n\n" +
                            "6. Je, Kitabu cha MUNGU kimetolewa kwa watu wa taifa moja tu?\n" +
                            "MUNGU amewaumba watu wote. \"Naye (MUNGU) alifanya kila taifa la wanadamu kutoka katika mmoja, wakae juu ya uso wa nchi yote.\" Matendo 17:26. " +
                            "Huenda wakatofautiana kwa rangi, na mazoea yao walakini, wote huhitaji chakula, mwanga na maji ili wapate kuishi. Lakini, wote ni " +
                            "wakosaji. \"Kwa sababu wote wamefanya dhambi, na kupungukiwa na utukufu wa MUNGU.\" Warumi 3:23. Wote wanamhitaji MUNGU, wote " +
                            "hukihitaji kitabu cha NENO la MUNGU. Ni zawadi ya ajabu namba gani kutoka kwa MUNGU mwenye upendo kwa watoto wake! Ni kitu cha thamani zaidi " +
                            "tuwezacho kuwa nacho.\n" +
                            "Hadithi inasema juu ya mtu aliyekuwa akifa. Alimwuliza mmoja wa rafiki zake amsomee kutoka Kitabuni. \"Kitabu kipi?\" aliuliza " +
                            "rafiki yake. Akajibu aliyekuwa akifa, \"Kuna Kitabu kimoja tu - Neno la MUNGU.\"\n" +
                            "Ndugu msomaji mpendwa, kwa nini usimshukuru MUNGU kwa Kitabu Chake cha thamani kila siku ya maisha yako? Kipende sana kama barua yake " +
                            "ikuongozayo. Ni \"kitabu cha MUNGU, muujiza wa tangu zamani, kitabu cha vitabu.\"\n" +
                            "Mambo ya ulimwengu huu hubadilika, bali MUNGU wa milele asema, \"Kwani mimi Bana sibadiliki.\" Malaki 3:6. \"Maagizo yako yote ni amini. " +
                            "Yamekamilika daima na milele.\" Zaburi 111:7,8. Neno lake halitageuka kamwe milele.\n" +
                            "Zaidi ya miaka hamsini iliyopita mtu mmoja, Robert Ingersoll alisema ya kwamba, baada ya miaka kumi, Biblia isingesomwa tena. Je, ni jambo " +
                            "gani lililotokea kwa Biblia? Inachapwa katika lugha takriban 1100 na zaidi ya nakala 33,000,000 na sehemu nyingine za Maandiko Matakatifu " +
                            "huuzwa kwa mamilioni mwaka mmoja tu. Ni mfano wa jiwe lililo mraba - unaweza kuligeuza upande huu na upande huu, bali siku zote lasimama " +
                            "sawasawa wima, imara, na bila kuharibika\n\n"
                    /*"Maswali ya Somo la 3"*/),
            new Lessons("Somo la 4", "Rafiki ya MUNGU Awa Adui yake na Adui wa Watoto Wake",
                    "Fungu la Kukariri: \"Malaika wa Bwana hufanya kituo akiwazunguka wamchao na kuwaokoa.\" Zaburi 34:7\n\n" +
                            "UTANGULIZI\n" +
                            "Toka somo la kwanza na la pili tulijifunza kuwa MUNGU anaishi mbinguni  na kiti chake cha enzi kiko huko " +
                            "vilevile. Je, MUNGU anaishi peke yake huko? Je, Kuna viumbe wengine mbinguni? Mathayo 22:30 \" Bali huwa kama " +
                            "malaika mbinguni\" Luka 15:10 \"Kuna furaha mbele ya malaika wa MUNGU kwa ajili ya mwenye dhambi mmoja atubuye.\"" +
                            "Toka mafungu haya, twaweza kuona ya kwamba kuna viumbe wengine mbinguni; na ya kwamba viumbe hawa huitwa malaika.\n\n" +
                            "MALAIKA MBINGUNI\n" +
                            "1. Ni nani aliyewaumba malaika hawa?\n" +
                            "Watu wengi wanataka tuamini ya kwamba malaika ni roho za watu waliokufa, ama ni majini (mapepo). Twajua ya kwamba malaika " +
                            "si roho za wafu hata kidogo kwa sababu kulikuwako na malaika kabla ya mtu yeyote kufa. Mwanzo 3:24 \"Basi akamfukuza huyo mtu; " +
                            "akaweka Makerubi upande wa mashariki wa bustani ya Edeni.\" (Kerubi ni malaika). Ezekiel 28:14 \"Wewe ulikuwa Kerubi mwenye kutiwa " +
                            "mafuta afunikaye.\" Twajua vilevile ya kwamba malaika hawa waliumbwa na MUNGU pia; kwa sababu katika wakolosai 1:16 atwambia ya " +
                            "kwamba \"Kwa kuwa katika yeye vitu vyote viliumbwa, vilivyo mbinguni na vilivyo juu ya nchi.\" Pia Waebrania 2:7 \"Umemfanya " +
                            "(mwanadamu) mdogo punde kuliko malaika.\" Ndiyo, malaika pia waliumbwa na MUNGU.\n\n" +
                            "2. Je, Kuna malaika wangapi?\n" +
                            "\"Maelfu wakasimama mbele zake, (MUNGU), na elfu kumi mara elfu kumi wakasimama mbele Zake. \"Danieli 7:10. \"Nikaona nikasikia sauti " +
                            "ya malaika wengi pande zote za kiti cha enzi... na hesabu yao ilikuwa elfu kumi mara elfu kumi na elfu mara elfu.\" Ufunuo 5:11.\n\n" +
                            "3. Kazi ya malaika hao ni nini?\n" +
                            "\"Malaika elfu wakamtumikia\" Daniel 7:10. Waebrania 1:6 \"Na wamsujudu malaika wote wa MUNGU.\" Malaika wanahudumu na " +
                            "kumsujudia MUNGU. Wanamtii kabisa. Zaburi 103:20 \"Mhimidini Bwana enyi malaika zake... mtendao neno lake, mkiisikiliza " +
                            "sauti ya Neno Lake,\" MUNGU vilevile hutuma malaika katika ulimwengu huu kuwatunza watoto wake ama kwa makusudi yake mengine. " +
                            "Zaburi 34:7 \"Malaika wa Bwana hufanya kituo akiwazungukia wamchao na kuwaokoa.\n" +
                            "Waebrania 1:13,14 \"Je, yuko malaika aliyemwambia wakati wowote, Uketi mkono wangu wa kuume hata nitakapowaweka adui zako chini ya " +
                            "nyayo zako? Je, hao wote malaika si roho watumikao, wakitumwa kuwahudumu wale watakaourithi wokovu?\" Ndiyo, malaika humhudumia MUNGU, " +
                            "na wanadamu pia. Zaburi 91:10,11 \"Mabaya hayatakupata wewe, wala tauni haitakaribia hema yako. Kwa kuwa atakuagizia malaika wake, " +
                            "wakulinde katika njia zako zote.\" Kama mashaka yakikuzunguka pande zote, malaika hutumwa na MUNGU kutusaidia. Kila mtoto wa MUNGU ana " +
                            "malaika wa kumlinda. Mathayo 18:10 \"Angalieni msidharau mmoja wa wadogo hawa; kwa maana nawaambieni ya kwamba malaika wa mbinguni siku " +
                            "zote huutazama uso wa Baba yangu aliye mbinguni.\"\n" +
                            "Pia Matendo 12:15,16. \"Wakamwambia, una wazimu. Lakini yeye akakaza sana akasema ya kwamba ndivyo hivyo. Wakanena ni malaika wake " +
                            "(yaani malaika wa Petro).\" Ndiyo, kila mtoto wa MUNGU ana malaika wake wa kumlinda.\n\n" +
                            "RAFIKI WA MUNGU AWA ADUI YAKE\n" +
                            "Tumesoma ya kwamba malaika ni watoto wa MUNGU kwa sababu walikuwa naye. Ni rafiki za MUNGU, maana wamhudumia na kumtii na kusaidia " +
                            "katika mipango Yake kwa watoto wake ulimwenguni. Lakini siku moja, mmoja kati ya malaika hawa alimwasi MUNGU. Alimwasi Muumba wake. " +
                            "Jina lake aliitwa Lusifa ama \"nyota ya alfajiri.\" Isaya 14:12 \"Jinsi ulivyoanguka toka mbinguni ewe nyota ya afajiri, mwana wa " +
                            "asubuhi\". Alikuwa malaika mkuu mbinguni, kwani, Ezekiel 28:14 atwambia \"Wewe ulikuwa kerubi mwenye kutiwa mafuta afunikaye,\" Kifungu " +
                            "kifuatacho kinatuambia \"Ulikuwa mkamilifu katika njia zako tangu siku ile ulipoumbwa, hata uovu ulipoonekana ndani yako.\"\n\n" +
                            "JE, MUNGU MWEMA ANGEWEZAJE KUMUUMBA SHETANI MBAYA?\n" +
                            "Je, MUNGU alimuumba Shetani? La. MUNGU alimuumba Lusifa, malaika mkamilifu, bali Lusifa akajifanya mwenyewe shetani. Unauliza " +
                            "yanawezekanaje mambo haya? Lusifa angewezaje kujifanya hivi? Kwa sababu Lusifa alikuwa na uwezo wa kuchagua kufanya kama mtu yeyote " +
                            "awezavyo kuchagua.\n" +
                            "MUNGU hakumuumba mwanadamu au malaika kama mtambo, ambao lazima ufanye jambo fulani ulilokusudiwa ulifanye tu na hauwezi kufanya jambo " +
                            "jingine kando ya hilo. Hebu tuyafafanue maneno haya kwa mfano wa sasa. Saa hutiwa majira, nayo huenda sawa, haiwezi kufanya jambo liwalo " +
                            "lote tena zaidi ya hilo. Inafanya vile ilivyokusudiwa kufanya. Mwanadamu siyo hivyo. Mwanadamu aweza kufanya uchaguzi. MUNGU anataka " +
                            "tumtumikie na tumheshimu kwa sababu twampenda, si kwamba ni lazima tufanye hivyo kama mitambo.\n" +
                            "Malaika na wanadamu wanao uwezo wa kuchagua kumtii MUNGU ama kutomtii. Hivyo Lucifa alichagua kutomtii MUNGU. Hivyo akatupwa. Ufunuo " +
                            "12:7-9 \"Kulikuwa na vita mbinguni; Mikaeli (Yesu) na malaika zake wakapigana na yule joka naye akapigana nao pamoja na malaika zake; " +
                            "nao hawakushinda, wala mahali pao hapakuonekana tena mbinguni. Yule joka akatupwa, yule mkubwa, nyoka wa zamani, aitwaye ibilisi na shetani, " +
                            "audanganyae ulimwengu wote; akatupwa hata nchi; malaika zake wakatupwa pamoja naye.\" Tokea hapo ndipo Lucifa akajulikana kama Shetani. " +
                            "Ibilisi na Joka. Ingawa anajulikana kama joka, ama \"nyoka yule wa zamani,\" hana umbo lile hata kidogo.\n\n" +
                            "4. Je, Shetani ana umbo gani?\n" +
                            "Kwa nini MUNGU alimruhusu shetani kuja hapa ulimwenguni na kumdanganya mwanadamu? Je, MUNGU asingeweza kumwangamiza shetani mara " +
                            "alipofanya dhambi? Ndiyo, alikuwa na uwezo kamili wa kumwangamiza, bali, kwa vile MUNGU ni MUNGU wa haki, asingemwangamiza. Shetani " +
                            "alikuwa amesema mabaya mengi mno juu ya MUNGU mbele ya malaika wengine. Alikuwa amemsingizia mambo ya uongo tu, ambavyo MUNGU " +
                            "asingeweza kufanya. Hao malaika wakaanza kumshuku MUNGU na kumwamini shetani. Laiti MUNGU angemtowesha shetani mara moja, malaika " +
                            "wale wangeendelea kumshuku zaidi. Wangeweza kufikiri ya kwamba shetani alikuwa akiwaambia kweli juu ya MUNGU. Je, ingethibitishwaje ni " +
                            "nani aliye mkweli, MUNGU ama shetani na hali shetani amekwisha kufa. Laiti MUNGU angemwangamiza shetani, malaika wangemwogopa MUNGU, " +
                            "wangemtumikia kwa sababu ya hofu tu, na wala si kwamba walikuwa wakimpenda. MUNGU ni pendo. Naye anapenda kazi ya upendo. Alimwachia shetani " +
                            "aishi tu hata watoto wake watakapoona shetani ni mbaya wa kiasi gani na MUNGU ni pendo na haki kiasi gani. Shetani atakapojionesha " +
                            "kwa watu wote ya kwamba ni mbaya na ya kwamba hakuna uzuri wowote ndani yake, watoto wa MUNGU hawatamshuku MUNGU tena, ndipo shetani " +
                            "atakapoangamizwa. Ndipo atakapoteketezwa. Ufunuo 20: 10 \"Na yule Ibilisi, mwenye kuwadanganya, atakapotupwa katika ziwa la moto.\" " +
                            "Mathayo 25:41: \"Moto wa milele, uliowekewa tayari Ibilisi na malaika zake.\n\n" +
                            "TUTAMTUMIKIA NANI - MUNGU AMA SHETANI?\n" +
                            "Shetani alisema uongo juu ya MUNGU mbele za malaika. Alishawishi wengine wakawa upande wake. Yeye ni mwongo na baba wa uongo. Yohana " +
                            "8:44 \"Ninyi ni wa baba yenu Ibilisi. (Hapa anawaambia watu waovu)... kwa sababu yeye ni mwongo, na baba wa huo.\" Hili lingekuwa onyo " +
                            "kwetu, kufunga masikio tusisikie uongo wake wote. Twawiwa pendo na MUNGU, bali yote tuwiwayo na Shetani ni vita kali tuwezavyo kujikinga naye. " +
                            "Ahadi zake si za kuzitegemea.\n" +
                            "Msomaji, ni yupi ambaye utamfuata, shetani mwongo ama MUNGU WA UPENDO?\n\n"
                    /*"Maswali ya Somo la 4"*/),
            new Lessons("Somo la 5", "Watoto wa MUNGU Wanampa Adui Yao Dunia Hii",
                    "Fungu la Kukariri: \"Kila atendaye dhambi ni mtumwa wa dhambi.\" Yohana 8:34.\n\n" +
                            "UTANGULIZI.\n" +
                            "Ulimwengu ni mali ya MUNGU, Yeye ndiye muumba wake. Alimuumba mtu wa kwanza, Adamu, kuutawala. Hivyo ni kwamba " +
                            "Adamu alikuwa na jukumu la kumtunzia MUNGU dunia hii, kumtunzia MUNGU. Basi MUNGU akauacha ulimwengu katika utunzaji " +
                            "wa Adamu ni heshima kubwa kiasi gani aliyopewa Adamu? Je! Aliendelea kumtunzia MUNGU dunia hii? Je, alilinda utawala " +
                            "wake usiingiliwe? Tutaona.\n\n" +
                            "SHETANI AUFANYA ULIMWENGU HUU KUWA MAKAO YAKE MAKUU\n" +
                            "1. Je, Shetani na malaika zake walipotupwa toka mbinguni walikwenda wapi?\n\n" +
                            "Walikuja katika dunia hii. Ufunuo 12:9 \"Yule joka akatupwa, yule mkubwa, nyoka wa zamani, aitwaye ibilisi na shetani " +
                            "audanganyaye ulimwengu wote; akatupwa hata NCHI, na malaika zake wakatupwa pamoja naye\" Ayubu 1:6,7 \"Ilikuwa siku moja " +
                            "ambayo hao wana wa MUNGU, walikwenda kujihudhurisha mbele za Bwana, Shetani naye akaenda kati yao. Bwana akamwuliza shetani, " +
                            "umetoka wapi wewe? Ndipo shetani akamjibu Bwana, na kusema, natoka katika kuzunguka zunguka DUNIANI, na kutembeatembea huku " +
                            "na huku HUMO.\"\n\n" +
                            "2. Shetani alifanya nini duniani humu?\n" +
                            "Alifanya kama vile alivyokuwa amefanya huko mbinguni, kwa kutumia uongo alijaribu kumpata yule mtu wa kwanza. Adamu na mwanamke " +
                            "wa kwanza Hawa; ili wasimwamini MUNGU, wamwasi. Je, mambo haya yalikuwaje?\n" +
                            "Mwanzo 2:15-17 \"Bwana MUNGU akamtwaa huyo mtu, akamuweka katika bustani ya Edeni, ailime na kuitunza. Bwana MUNGU akamwagiza huyo " +
                            "mtu, akisema, matunda ya kila mti wa bustani waweza kula, walakini matunda ya mti wa ujuzi wa mema na mabaya usile. Kwa maana siku " +
                            "utakapokula matunda ya mti huo utakufa hakika\". MUNGU aliuweka mti huu katika bustani ili mtu aweze kuchagua kama atamheshimu MUNGU " +
                            "Muumba wake ama atamwasi. Sasa Shetani alijua ya kwamba MUNGU alikuwa amekwisha kumwambia Adamu maneno haya. Naye (Shetani) akatokea " +
                            "katika bustani kwa mfano wa nyoka ili aweze kuwadanganya Adamu na Hawa. Aliyarudia maneno ambayo MUNGU alikuwa amewaambia kwa kiasi " +
                            "fulani.\n" +
                            "Mwanzo 3:1 \"Basi nyoka alikuwa mwelevu kuliko mnyama yeyote wa mwitu aliowafanya Bwana MUNGU. Akamwambia mwanamke, Ati! Hivi ndivyo " +
                            "alivyosema MUNGU, msile matunda ya miti yote bustanini?\". Je, Hawa alijibu nini? \"Mwanamke akamwambia nyoka: Matunda ya miti ya " +
                            "bustani twaweza kula; lakini matunda ya mti ulio katikati ya bustani, MUNGU amesema, tusile wala tusiyaguse, tusije tukafa.\" " +
                            "Mwanzo 3:2,3.\n" +
                            "Nyoka alisema nini tena? \"Nyoka akmwambia mwanamke, hakika hamtakufa; kwa maana MUNGU anajua ya kwamba siku mtakayokula matunda ya " +
                            "mti huo, mtafumbuliwa macho, nanyi mtakuwa kama MUNGU mkijua mema na mabaya.\" Mwanzo 3:4,5. Huu ndio ulikuwa UONGO WA KWANZA kusemwa " +
                            "katika dunia hii. Si ajabu Kristo alivyosema juu ya shetani katika Yohana 8:44 \"Yeye ni mwongo na baba wa huo.\" Na sehemu ya kuhuzunisha" +
                            " ni ya kwamba watu wengi bado wanauamini uongo ule wa shetani. Wanaamini ya kwamba watu hawafi hasa.\n\n" +
                            "3. Je, binadamu alimwamini Shetani?\n" +
                            "Ndiyo, huyo mwanamke alimwamini na kulichukua tunda alilokuwa amekatazwa na kulila. Mwanzo 3:6 \"Mwanamke alipoona ya kuwa ule mti " +
                            "wafaa kwa chakula, wapendeza macho, nao ni mti wa kutamanika kwa maarifa, basi alitwaa katika matunda yake akala akampa na mumewe naye " +
                            "akala.\"\n" +
                            "Ilikuwa ni huzuni. Siku ya huzuni kwa MUNGU na kwa Adamu. Ni kwa jinsi gani tendo lile la uasi lilivyouumiza moyo wa MUNGU!\n" +
                            "Je, MUNGU aliwakataa watoto waasi na kuwatupilia mbali? La. ALIWAPENDA SANA, hata akashuka katika dunia hii kuzungumza nao. Bali " +
                            "waliaibika kwa yale waliyokuwa wamefanya, nao hawakupenda kumwona MUNGU. Walimwogopa. Mwanzo 3:8-10 \"Kisha wakasikia sauti ya Bwana " +
                            "MUNGU, akitembea bustanini, wakati wa jua kupunga; Adamu na mkewe wakajificha kati ya miti ya bustani, Bwana MUNGU asiwaone. Bwana " +
                            "MUNGU akamwita Adamu, akamwambia uko wapi? Akasema, nalisikia sauti yako bustanini, nikaogopa kwa kuwa mimi ni uchi, nikajificha.\"\n" +
                            "Hivyo ndivyo uasi unavyofanya. Unatuletea hofu mioyoni mwetu. MUNGU angefanya nini sasa? Aliwapa ahadi nzuri watoto hawa walioasi. " +
                            "Aliwapenda bado. Aliwapa ahadi nzuri ambayo tutajifunza katika somo lijalo.\n\n" +
                            "KUMWASI MUNGU NI DHAMBI\n" +
                            "4. Huku kumwasi MUNGU na kumtii Shetani kunaitwaje katika Biblia?\n" +
                            "Kunaitwa \"dhambi.\" Warumi 5:12 \"Kwa hiyo, kama kwa mtu mmoja dhami iliingia ulimwenguni, na kwa dhambi hiyo mauti...\" \"Kwa maana " +
                            "ikiwa MUNGU hakuwaachilia malaika waliokosa,...\" 2Petro 2:4. Haileti tofauti yoyote ikiwa ni malaika wema au wanadamu wamwasio MUNGU na " +
                            "kumtii shetani, hiyo ni dhambi tu. Adamu asingefanya dhambi, bali alichagua kumwasi MUNGU na kumtii shetani. Tendo hili lilikuwa ni " +
                            "dhambi\n\n" +
                            "5. Ni tofauti gani ambayo hutokea ndani ya yule ambaye amefanya dhambi.\n" +
                            "Huwa mtumwa wa dhambi. Yuko katika utumwa wa yule aliyemjaribu ili afanye dhambi. Yohana 8:34 \"Kila atendaye dhambi ni mtumwa wa " +
                            "dhambi.\" Warumi 6:16 \"Hamjui ya kuwa kwake yeye ambaye mnajitoa nafsi zenu kuwa watumwa wake katika kumtii, mmekuwa watumwa wake " +
                            "yule mnayemtii.\"\n\n" +
                            "ADAMU AUTOA ULIMWENGU HUU KWA ADUI YAKE\n" +
                            "6. Shetani anaitwa \"Mkuu wa ulimwengu huu.\" (Yohana 12:31)\n" +
                            "Shetani vilevile huitwa \'mungu wa dunia hii\' 2Wakorintho 4:4 \"Ambao ndani yao mungu wa dunia hii amewapofusha fikara zao wasioamini.\" " +
                            "Je, hayo siyo aliyowafanyia Adamu na Hawa? Aliwapofusha fikira zao nao hawakuliamini neno la MUNGU. Katika hali ya kupofushwa walijitoa " +
                            "wenyewe kuwa mateka wa shetani na pia kusalimisha utawala wao wa dunia hii kwake. Ipo siku moja utawala huu utarejeshwa kwao.\n\n" +
                            "7. Adamu aliupoteza utawala wa dunia hii kama matokeo ya dhambi yake. Je, ni nini tena alichokipoteza?\n" +
                            "Alipoteza mji wake mzuri wa bustani. Mwanzo 3:23,24, \"Kwa hiyo Bwana MUNGU akamtoa katika Bustani ya Edeni, ailime ardhi ambayo katika " +
                            "hiyo alitwaliwa. Basi akamtukuza huyo mtu, akaweka makerubi upande wa mashariki wa bustani ya Edeni na upanga wa moto uliogeuka huko na " +
                            "huko, kulinda njia ya mt wa uzima.\" Katika fungu la 22 la sura hii twasoma ya kwamba, kama Adamu angekula matunda ya ule mti wa uzima " +
                            "uliokuwa mle katika bustani, angelikuwa ni mdhambi anayeishi milele.\n" +
                            "Hivyo Mungu alimfukuza toka bustanini kwani alikuwa amekwisha kumwambia ya kwamba, \"utakufa hakika.\" Adamu akaupoteza UZIMA WA " +
                            "MILELE kwa matokeo ya dhambi yake. Warumi 6:23 \"Kwa maana mshahara wa dhambi ni mauti, Je, huo ni mshahara wa kutamanika? HASHA!\n\n" +
                            "8. Kwa dhambi yake, Adamu alipata nini?\n" +
                            "Adamu aliipata \"michongoma na miiba.\" Zaidi ya hayo alikabiriwa na kazi nyingi na ngumu. \"Kwa kuwa umesikiliza sauti ya mke wako, " +
                            "ukala matunda ya mti ambao nilikuagiza, nikisema, usiyale; ardhi imelaaniwa kwa ajili yako; kwa uchungu utakula mazao yake siku zote " +
                            "za maisha yako; michongoma na miiba itakuzalia nawe utakula mboga za kondeni; kwa jasho la uso wako utakula chakula; hata utakapoirudia " +
                            "ardhi, ambayo katika hiyo ulitwaliwa, kwa maana u mavumbi wewe, nawe mavumbini utarudi.\" Mwanzo 3:17-19.\n" +
                            "Adamu alikuwa amekwisha fanya kazi kabla ya kutenda dhambi, kuitunza bustani ya Edeni, bali kufanya kazi huku chini ya laana si sawa na " +
                            "ufanyaji kazi aliokuwa nao kule bustanini chini ya utii wa MUNGU na utakatifu. MUNGU alijua ya kwamba, mwanadamu asipofanya kazi atamsahau, " +
                            "naye atamtendea dhambi, hivyo, MUNGU akairuhusu michongoma na miiba kumea, ili mtu ale chakula chake kwa jasho la uso wake. Huzuni " +
                            "ilikuwa sehemu yake toka siku ile.\n" +
                            "Je, unadhani hili lilikuwa badiliko la busara? Kugeuza maisha yake ya furaha, mji wake wa kupendeza, uzima wake wa milele, kwa maisha ya " +
                            "kazi ngumu, ya huzuni na kifo?\n" +
                            "Ni lipi la kupendeza zaidi, maisha ya utii kwa Shetani na kupokea laana zake zote au utii kwa MUNGU na baraka tele?\n" +
                            "Ni lazima ufanye uamuzi, msomaji, uamue utakalochagua, Joshua 24:15 \"Chagueni hivi leo mtakayemtumikia ... Lakini mimi na nyumba yangu " +
                            "tutamtumikia Bwana.\"\n\n"
                    /*"Maswali ya Somo la 5"*/),
            new Lessons("Somo la 6", "Mpango wa MUNGU wa Kuwakomboa Watoto Wake Toka kwa Aduia Yao",
                    "Fungu la Kukariri: \"Kwa maana jinsi hii Mungu aliupenda ulimwengu, hata akamtoa Mwanawe pekee, ili kila natu amwaminiye " +
                            "asipotee, bali awe na uzima wa milele.\" Yohana 3:16.\n\n" +
                            "UTANGULIZI\n" +
                            "MUNGU alipomweka Adamu katika bustani, alimwambia ya kwamba akila katika matunda ya mti ule aliomkataza, atakufa" +
                            " hakika. MUNGU hukusudia yale asemayo. Ama asingekuwa Mungu wa kweli ama wa haki. Katika Ezekieli 18:32 tunasoma: " +
                            "\"Maana mimi sikufurahii kufa kwake afaye, asema Bwana Mungu.\"" +
                            "Kifo cha mtu hakikumfurahisha MUNGU, Bali alijua ya kwamba ni bora kwake kufa kuliko kuishi milele chini ya " +
                            "utumwa wa dhambi na Shetani. Kwa vyo vyote, MUNGU aliweka mpango wa kumfanya mwanadamu asidumu katika kifo. " +
                            "Alipenda mwanadamu aishi na kukaa pamoja naye. Katika somo hili tutajifunza juu ya mpango huu wa ajabu.\n\n" +
                            "HALI YA MWANADAMU KATIKA DHAMBI\n\n" +
                            "1. Hali ya mwanadamu katika dhambi huwaje?\n" +
                            "(a) Mwanadamu aishiye katika utumwa wa dhambi ameharibikiwa. Ametenda chukizo. Hakuna atendaye mema. Zaburi 14:1 " +
                            "\"Mpumbavu asema moyoni, Hakuna MUNGU; Wameharibu matendo yao na kufanya chukizo, Hakuna mtenda mema.\"\n" +
                            "(b) Sisi sote ni kama kitu kichafu na matendo yetu mema ni kama matambara machafu. Isaya 64:6 \"Kwa maana sisı sote tumekuwa " +
                            "kama mtu aliye MCHAFU NA MATENDO YETU YOTE YA HAKI yamekuwa kama nguo iliyotiwa unajisi; sisi sote twanyauka kama jani, na " +
                            "maovu yetu yatuondoa, kama upepo uondoavyo.\"\n" +
                            "(c) Hakuna mwenye haki. Kama ilivyoandikwa, ya kwamba, \"Hakuna mwenye haki hata mmoja.\" Warumi 3:10.\n" +
                            "(d) \"Wote wamefanya dhambi. Kwa sababu wote wamefanya dhambi, na kupungukiwa na utukufu wa MUNGU.\" Warumi 3:23\n" +
                            "(e) \"Moyo huwa mdanganyifu kuliko vitu vyote\" Yeremia 17:9. Maneno haya yametoa mfano wa mtu aishiye katika dhambi. Dhambi " +
                            "si kitu cha kujivunia. Dhambi ni kile kitu ambacho MUNGU anakichukia. \"Kiburi na majivuno, na njia mbovu, na kinywa cha " +
                            "ukaidi pia nakichukia.\" Mithali 8:13. Bali INGAWA MUNGU ANAICHUKIA DHAMBI bado ANAMPENDA MWENYE DHAMBI. \"Lakini MUNGU, kwa " +
                            "kuwa ni mwingi wa rehema, kwa upendo wake mkuu aliotupenda; hata wakati ule tulipokuwa wafu kwa sababu ya makosa yetu.\" " +
                            "Waefeso 2:4,5. Je, hayo si mapenzi ya ajabu? Tafadhali ulisome tena fungu la kukariri, \"Kwa maana jinsi hıi MUNGU aliupenda ulimwengu.\"\n\n" +
                            "2. Je, mtu aweza kujiokoa mwenyewe toka dhambini?\n" +
                            "La, mwanadamu hawezi kujiokoa mwenyewe toka dhambini \"Ole wangu, maskini mimi! Ni nani atakayeniokoa na mwili huu wa mauti?\" " +
                            "Warumi 7:24. \n" +
                            "Zamani sana mtu alikuwa akihukumiwa kufa kwa kufungamanishwa na maiti kwa mnyororo. Alikuwa hatenganishwi kabisa na maiti hiyo. " +
                            "Po pote alipokwenda, usiku ama mchana, maiti hiyo ilifungamanishwa naye, mwishowe mwili wake ungekufa. Lo! Ni kifo cha kufisha " +
                            "kiasi gani hiki! Mtu huyo azikwapo, maiti ile huzikwa pamoja naye. Kweli, dhambi ni mauti ile, itayaharibu maisha yetu ikiwa " +
                            "hatutatengwa nayo. Mwanadamu kwa ajili ya dhambi ametengwa na MUNGU. \"Lakini maovu yetu yamewafarikisha ninyi na  MUNGU wetu, na " +
                            "dhambi zenu zimeuficha uso wake msiuone.\" Isaya 59:2. Mtu ametengwa na MUNGU kwa ajili ya dhambı naye amefungamanishwa nazo.\n\n" +
                            "MUNGU ATOA MSAADA KWA MWANADAMU.\n\n" +
                            "3. Ni nani pekee awezaye kumsaidia mwanadamu kuepukana na utumwa wa Shetani?\n" +
                            "Warumi 7:25 \"Namshukuru MUNGU kwa YESU KRISTO BWANA wetu.\"\n" +
                            "Naam, MUNGU Baba na Yesu Kristo, Mwanawe, walifanya mpango ambao kwao mwanadamu aweza kuokolewa toka nguvu za Shetani. Hakuna " +
                            "mwingine ye yote awezaye kumwokoa mwanadamu ila KRISTO. Matendo 4:12 \"Wala hakuna wokovu katika mwingine awaye yote kwa maana hapana " +
                            "jina jingine chini ya mbingu walilopewa wanadamu litupasalo sisi kuokolewa kwalo.\"\n\n" +
                            "4. Je, ni lini mpango huu wa MUNGU ulipobuniwa?\n" +
                            "Mpango huu ulifanywa kabla ya dunia hii kuumbwa, MUNGU anajua mwisho tangu mwanzo. Alijua ya kwamba amemwumba mtu katika " +
                            "hali ya kuweza  kuchagua kutii ama kutotii. Alijua ya kwamba inawezekana mwanadamu akatenda dhambi. Tito 1:2 \"Katika tumaini la " +
                            "uzima wa milele ambao MUNGU asiyeweza kusema uongo aliuahidi tangu milele.\" 1 Petro 1:18-20 \"Nanyi mfahamu kwamba mlikombolewa si " +
                            "kwa vitu viharibikavyo, kwa fedha au dhahabu ... bali kwa damu ya thamani, kama mwana Kondoo asiye na ila, asiye na waa, yaani ya " +
                            "KRISTO. Naye amejulikana kweli tangu zamani, kabla haijawekwa misingi ya dunia.\"  Ufunuo 13:8 \"Mwana Kondoo (YESU) aliyechinjwa " +
                            "tangu kuwekwa kwa misingi ya dunia.\" Kabla ya ulimwengu huu haujaumbwa, Yesu alimwahidi Baba ya kwamba angemkomboa mwanadamu toka " +
                            "kwa Shetani.\n\n" +
                            "5. Je, mpango huu ulifunuliwa wazi lini kwa mwanadamu?\n" +
                            "Mpango huu ulidhihirishwa wazi kwa Adamu na Hawa kabla ya kufukuzwa toka bustanini. Hii ndiyo ahadi ya Mwanzo 3: 15 \"Nami nitaweka " +
                            "uadui kati yako na huyo mwanamke, na kati ya uzao wako na uzao wake; huo utakuponda kichwa, na wewe utamponda kisigino.” Saşa hii " +
                            "yaonekana kuwa ahadi ya ajabu. Maana yake ni nim? MUNGU alipokuwa akiyasema maneno yale alikuwa akiyasema waziwazi kwa huyo " +
                            "nyoka (Shetani). Mwanamke huyo ni Hawa. Alikuwa ndiye mwanamke pekee tu wakati ule. Uzao wake maana yake ni mtoto wake atakayetokea " +
                            "baadaye kutoka katika uzao wa Adamı na Hawa. Uzao wa Shetani maana yake ni wafuasi wa Shetani. Hivyo maneno haya maana yake ni kwamba " +
                            "kungekuwa na uadui kati ya wafuasi wa Shetani na uzao wa mwanamke, Hawa. Aina hizi mbili za watu zingekuwa na uhasama. Maana ya " +
                            "nyoka kuponda kisigino cha mzao wa mwanamke ni kwamba angemletea mateso na masumbuko ilhali uzao wa mwanamke ungemponda nyoka " +
                            "kichwa, yaani mwishowe ungemwangamiza Shetani kabisa, jinsi ilivyo ukimponda kichwa nyoka atakufa!. Hivyo Adamu na Hawa walijua " +
                            "ya kwamba ingawa wazao wao watapatwa na shida siku moja Shetani ataangamızwa kabisa na uhuru utarejea mahali pake tena.\n\n" +
                            "6. Ikiwa mwanadamu anaweza kuokolewa na Yesu tu, yawezekanaje basi uzao wa mwanamke kukiponda kichwa cha nyoka, ama kwa maana " +
                            "nyingine, kumwangamiza Shetani.?\n" +
                            "Yesu Kristo ndiye huyo Mwana ambaye angezaliwa baadaye, mzao wa mwanamke. Alikuwa mtoto wa Hawa. Wauliza, \"Vyawezekanaje hivi?\"" +
                            " yaani yeye kuwa Mwana wa Mungu na kwa wakati uo huo kuwa mwana wa Hawa? Naam, hii ndıyo njia ambayo kwayo vyawezekana. Yesu " +
                            "aliacha kiti chake cha enzi huko mbinguni na kuja katika dunia hii na kuzalıwa na mwanamke. Huwezi kulielezea jambo hili kwa ufasaha, " +
                            "hata mimi pia sıwezi, bali twaweza kuliamini kwani MUNGU amesema kuwa huo ndio ukweli wa mambo. Wagalatia 4:4 \"Hata " +
                            "ulipowadia utimilifu wa wakati, MUNGU alimtuma Mwanawe ambaye amezaliwa na mwanamke.\"\n" +
                            "Jina la mwanamke yule aliyemzaa Yesu ni Mariamu. Alikuwa wa uzao wa Adamu na Hawa kama vile sisi sote tulivyo. Tutalisoma " +
                            "tangazo la malaika: Mathayo 1:18-25 \"Kuzaliwa kwake Yesu Kristo kulikuwa hivi. Mariamu mama yake alipokuwa ameposwa na " +
                            "Yusufu, kabla hawajakaribiana, alionekana ana mimba kwa uwezo wa Roho Mtakatifu. Naye Yusufu mumewe, kwa Vile alivyokuwa mtu wa haki, " +
                            "asitake kumwaibisha, aliamua kumwacha kwa siri. Basi alipokuwa akifikiri hayo, tazama malaika wa Bwana alimtokea katika ndoto, " +
                            "akasema, Yusufu, mwana wa Daudi, usihofu kumchukua Mariamu mkeo, maana mimba yake ni kwa uwezo wa Roho Mtakatifu. Naye atazaa " +
                            "mwana, nawe utamwita jina lake YESU, maana, Yeye ndiye atakayewaokoa watu watoke katika dhambi zao. Hayo yote yamekuwa, ili " +
                            "litimie neno lililonenwa na Bwana kwa ujumbe wa manabii akisema, Tazama, bikira atachukua mimba, Naye atazaa mwana; Nao " +
                            "watamwita jina lake Imanueli, yaani Mungu pamoja nasi. Naye Yusufu alipoamka katika usingizi, alifanya kama malaika wa Bwana " +
                            "alivyomwagiza; akamchukua mkewe; asimjue kamwe hata alipomzaa mwanawe; mwanawe akamwita jina lake YESU.\"\n" +
                            "Watu waovu walikuwa na husuda (kijicho, wivu) naye walimtesa na mwishowe wakamwua kwa kumsulubisha msalabani. " +
                            "(soma Mathayo 27).\n\n" +
                            "7. Je, wote wataokolewa na Yesu Kristo kutoka dhambini?\n\n Mungu anataka watu wote waokolewe. Yohana 6:37 \"Ye yote ajaye " +
                            "kwangu sitamtupa nje kamwe.\" Fungu la kukariri lasema \"Kila mtu.\" Hivyo yaonyesha kwamba ye yote ajaye kwa Yesu Kristo " +
                            "aweza kuokolewa, na kupata kujua yaliyo kweli. Sehemu ya kusikitisha juu ya kisa hiki ni kwamba si wote watakaookolewa. " +
                            "Wangeweza kuokolewa bali wao wenyewe wanachagua kutokuokolewa. Wanaona bora kuzifia dhambi zao wenyewe kuliko kukipokea kifo " +
                            "cha Yesu kwa ajili yao.\n\n"
                    /*"Maswali ya Somo la 6"*/),
            new Lessons("Somo la 7", "Sehemu ya mwanadamu katika mpango wa MUNGU wa wokovu",
                    "Fungu la kukariri: \"Lakini katika  mambo haya yote tunashinda na zaidi ya kushinda kwa yeye aliyetupenda.\" Warumi " +
                            "8:37\n\n" +
                            "UTANGULIZI\n" +
                            "MUNGU anaichukia dhambi. Dhambi ndiyo ihusikayo na mashindando yote, chuki na vita ulimwenguni. Dhambi huvunja nyumba nyingi, " +
                            "huaibisha wazazi, hutenga marafiki, na kuharibu kila kitu. Kufanya dhambi kumekuwa mchezo. Siku hizi watu wanaiona dhambi kuwa " +
                            "kitu cha kutamanika zaidi. Dhambi ni deni, ni mzigo. Dhambi huleta kifo. Bali kwa sababu MUNGU ANAWAPENDA WENYE DHAMBI, alimtoa " +
                            "Mwana wake ili tupate kuishi. Hivyo ilikuwa ni sehemu ya mpango wa MUNGU wa ajabu. Na sisi je! sehemu yetu ni ipi? MUNGU hawezi " +
                            "kuufanya mpango huu ufaulu peke yake. Je, sisi tunatakiwa kufanya nini?\n\n" +
                            "HATUA YA KWANZA KATIKA KUUFANYA MPANGO WA MUNGU UFAULU KATIKA MAISHA YETU.\n\n" +
                            "1. Ni maswali gani yenye maana sana ulimwenguni?\n\n" +
                            "Maswali yenye wito na ya maana ni haya yapatikanayo katika Matendo 16:30 \"Yanipasa nifanye nini nipate kuokoka?\" Na Luka 18:18 \"Nifanye nini ili " +
                            "nipate kuurithi uzima wa milele?\". Tumekwisha kujifunza yote YESU aliyoyafanya ili kutuokoa. Na sasa ni wajibu wetu kulijua lile " +
                            "ambalo latupasa sisi kulifanya.\n\n" +
                            "2. Je, hatua gani ya kwanza mwanadamu imempasa kuifanya katika kumsaidia MUNGU kuendesha mbele mpango wake wa wokovu?\n\n" +
                            "Paulo anasema \"Mwamini Bwana YESU.\" Maana ya kumwamini Bwana Yesu ni nini? Ni zaidi ya kuamini ya kwamba alikufa. Ni lazima " +
                            "UAMINI ya kwamba ALIKUFA. Hakuna njia nyingine.\n" +
                            "\"Wala hakuna wokovu katika mwingine awaye yote kwa maana hapana jina jingine chini ya mbingu tulilopewa wanadamu litupasalo sisi " +
                            "kuokolewa kwalo.\" Matendo 4:12. Itikadi (IMANI) ni hatua ya kwanza. Marko 11:22. \"Mwamini MUNGU\". Watu wengine wanasema ya kwamba " +
                            "hawana imani. Wanasema hawawezi kuamini. Hii si kweli. MUNGU amempatia kila mmoja imani. Warumi 12:3 \"Kama MUNGU alivyomgawia KILA MTU " +
                            "kiasi cha imani.\" Hivyo tunaweza kuamini. Tunaweza kuamini kila kitu MUNGU asemacho, kwa ambavyo Yeye ni \"MUNGU ... mwingi wa " +
                            "kweli.\" (Kutoka 34:6). Ndiyo twaweza kuamini kwamba YESU ni Mwokozi aliyetuokoa kutoka dhambini.\n\n" +
                            "3. Hatua ya pili impasayo mwanadamu kuifanya ni ipi?\n\n" +
                            "Hatua ya pili ni TOBA. \"Tubuni basi mrejee, ili dhambi zenu zifutwe.\" Matendo 3:16. Tuna maana gani tunapoongelea kuhusu TOBA? " +
                            "Kutubu ni kusikitika kwa nini umetenda dhambi, kusikitika sana hata umwambie MUNGU ya kwamba utaziacha na wala hutazifanya tena. " +
                            "Ayubu alisema \"Kwa sababu hiyo najichukia nafsi yangu, na kutubu.\" Ayubu 42:6. Mtu aionapo hali yake katika dhambi, na pia anapouona " +
                            "wema wa MUNGU katika kujaribu kumsaidia atoke dhambini, atajichukia mwenyewe. Atazitubia dhambi zake. Ni jambo gani linalotukia ikiwa mtu " +
                            "hakutubu? Luka 13:3 \"Msipotubu, ninyi nyote mtaangamia vivyo hivyo.\" Kwa nini toba ni ya lazima? Ikiwa mtu hakutubu, ikiwa haziachi " +
                            "dhambi zake, hatapendelea kuiacha dhambi ile. Hii inatuleta katika ile sehemu nyingine ya Matendo 3:19. \"Tubuni basi, mrejee.\" Maana " +
                            "ya kurejea ni nini? Ni kugeuka nyuma na kuanza kuelekea upande kinyume kabisa na ule uliokuwa unaelekea. Kwanza ulikuwa katika dhambi, kuki" +
                            "endea kifo; sasa umegeuka kinyume, unaikataa dhambi, na kuuendea uzima wa milele. Je, MUNGU na malaika huwa katika hali gani mwenye " +
                            "dhambi mmoja anapotubu? \"Kutakuwa na furaha mbinguni kwa ajili ya mwenye dhambi mmoja atubuye.\" Luka 15:7. \"Bwana hapendi mtu yeyote " +
                            "apotee, bali wote wafikilie toba.\" 2 Petro 3:9. Ndiyo, rafiki, MUNGU anakungojea kwa moyo wa kutamani ili utubu. Inamletea furaha." +
                            "Inakuletea uzima.\n\n" +
                            "4. Ni hatua gani ya tatu impasayo mwanadamu kuchukua?\n\n" +
                            "Hatua ya tatu ni UNGAMO LA DHAMBI. \"Sasa basi, ungameni mbele za Bwana.\" Ezraa 10:11. \"Afichaye dhambi zake hatafanikiwa; bali " +
                            "yeye aziungamaye na kuziacha atapata rehema.\" Mithali 28:13. MUNGU yu tayari kuwa na huruma na kutusamehe dhambi zetu tuziungamapo." +
                            "1Yohana 1:9. \"Tukiziungama dhambi zetu, Yeye ni mwaminifu na wa haki hata atuondolee dhambi zetu na kutusafisha na udhalimu wote.\"" +
                            " Tuungamiapo MUNGU dhambi zetu, ni lazima tuamini ya kwamba husamehe, vinginevyo tutaonesha ya kwamba  twaihofia ahadi yake. MUNGU " +
                            "asema atazitupa dhambi zetu nyuma yake.\n" +
                            "Katika Isaya 38:17 tunasoma: \"Tazama, na ukiwa na uchungu mwingi kwa ajili ya amani yangu; lakini kwa kunipenda umeniokoa kutoka katika " +
                            "shimo la uharibifu; kwa maana umezitupa dhambi zangu zote nyuma yako\". Je, huna furaha kwa sababu hazitupi nyuma yako ama Shetani " +
                            "angeziona hapo mara moja? La, azitupa nyuma Yake.\n" +
                            "Pia Mika anasema: \"Atarejea na kutuhurumia; atayakanyaga maovu yetu; nawe (MUNGU) utazitupa dhambi zao zote katika vilindi vya bahari.\"" +
                            "Mika 7:19. MUNGU ashukuriwe! Atazitupa dhambi zetu katika vilindi vya bahari ambapo hatuwezi kuziona tena.\n" +
                            "Mambo ya Walawi 5:5 \"Kisha itakuwa, hapo watakapokuwa na hatia katika mambo hayo mojawapo, ndipo atakapoliungama jambo hilo " +
                            "ALILOLIKOSA.\" Ikiwa tumemwambia MUNGU ya kwamba tumetenda dhambi fulani, na kumuuliza atusamehe, dhambi hiyo hutiwa juu ya YESU. si " +
                            "yetu tena. Bali YESU amekwisha kuifia dhambi ile. Amekwisha kuilipa adhabu yake. Je, kuna ahadi nyingine ya ajabu kuliko hii? \"Yeye asiyejua " +
                            "dhambi alimfanya kuwa dhambi kwa ajili yetu.\" 2 Wakorintho 5:21\n" +
                            "Je, Tunafanya nini kama tumemkosea mtu mwingine? Tutayaungama makosa yetu na kumsihi atusamehe kwa kumkosea. \"Ungameni makosa yenu " +
                            "ninyi kwa ninyi.\" Yakobo 5:16. Ikiwa tumechukua au kuiba kitu cha mwingine itabidi tukirudishe. Hesabu 5:6-8. \"Uwaambie wana wa " +
                            "Israeli, mtu mume au mke atakapofanya dhambi yo yote ifanywayo na binadamu kumwasi Bwana, na mtu huyo akawa na hatia, ndipo watakapoungama " +
                            "dhambi yao waliyoifanya; naye ATARUDISHA kwa hatia yake\n" +
                            "Mambo ya Walawi 6:1-5. \"Bwana akanena na Musa, na kumwambia, Mtu awaye yote akifanya dhambi, na kuasi juu ya Bwana, akamdanganya " +
                            "mwenziwe; katika jambo la amana, au la mapato, au la kunyang'anya, au kumwonea mwenziwe; au kuzumbua kitu kilichopotea na kutenda la uongo " +
                            "juu yake, na kuapa kwa uongo; katika mambo hayo yote mojawapo atakalolitenda mtu, na kufanya dhambi kwalo. Ndipo itakapokuwa, akiwa " +
                            "amefanya dhambi na kupata hatia, atarudisha hicho alichokipata kwa kunyang'anya au kitu kile kilichopotea alichokizumbua yeye, au kitu " +
                            "chochote amekiapia uongo; atarudisha hata utimilifu wake. Paulo alimwambia askari wa gereza amwamini Bwana YESU. Aliwachukua Paulo na Sila, wali" +
                            "kuwa wamefungwa, na kuwaosha mapigo yao usiku huo huo. Hata hakungojea mpaka asubuhi. Ikiwa umemkosea jamaa yako, sawazisha kosa lako." +
                            " Mwoshe mapigo yake. Ndipo utakuwa na furaha moyoni mwako.\n" +
                            "Je, Imetupasa tumsamehe aliyetukosea? YESU aliwafundisha wanafunzi wake kuomba hivi: \"Utusamehe deni zetu kama sisi nasi tuwasamehevyo " +
                            "wadeni wetu.\" Kisha akaongeza. \"Bali msipowasamehe watu makosa yao, wala Baba yenu hatawasamehe ninyi\". Mathayo 6:12,15. Kama " +
                            "tunataka MUNGU atusamehe, ni lazima nasi tukubali kusameheana sisi kwa sisi. Ni lazima tumsamehe aliyetukosea mara nyingi.\n" +
                            "\"Kisha Petro akamwambia, Bwana, ndugu yangu anikose mara ngapi nimsamehe? YESU akamwambia, sikuambii hata mara saba, bali hata saba mara " +
                            "sabini.\" Mathayo 18:21-22.\n\n" +
                            "5. Ni hatua gani ya nne imlazimuyo mwanadamu kuichukua?\n\n" +
                            "Baada ya mtu kuyasikia mafundisho ya injili (Mathayo 28:19). Naye ameamini (Marko 16:15-16), ameungama na kurejea na kuwa mtu mwema " +
                            "(Matendo 3:19) ndipo anatakiwa abatizwe. Matendo 2:38. \"Tubuni MKABATIZWE kila mmoja kwa jina la YESU Kristo.\" \"Aaminiye na kubatizwa " +
                            "ataokoka\" (Marko 16:16). Baada ya kuzitimiza hatua zote nne inatupasa kuishi maisha mapya katika Kristo YESU. \"Tukijua neno hili; " +
                            "ya kuwa utu wetu wa kale (uhai wa dhambi) ulisulubiwa pamoja naye, ili mwili wa dhambi ubatilike, tusitumikie dhambi tena: kwa kuwa yeye " +
                            "aliyekufa amehesabiwa haki mbali na dhambi.\" Tumepewa neno la MUNGU ili litusaidie katika kupigana vita na dhambi. YESU alipokuwa " +
                            "akijaribiwa na Shetani baada ya kubatizwa kwake, alimjibu Shetani kwa kutumia mafungu toka katika Maandiko Matakatifu. Soma Mathayo " +
                            "4:1-11. Je, msomaji, huoni kwamba MUNGU amefanya kila kitu kinachowezekana katika kuwaokoa watoto wake? Ikiwa dhambi zako zimeungamwa, " +
                            "MUNGU akujalie kuwa mwenye haki kama Mwana wake YESU. Ahadi hizi ni zako. Je, Utazipokea?\n\n"
                    /*"Maswali ya Somo la 7"*/),
            new Lessons("Somo la 8", "MUNGU Huweka Kumbukumbu za watoto wake.",
                    "Fungu la Kukariri: \"Furahini kwa sababu majina yenu yameandikwa mbinguni.\" Luka 10:20.\n\n" +
                            "UTANGULIZI.\n\n" +
                            "MUNGU anayo sheria ambayo kwayo watoto wake inawapasa kuishi. Kwa kuyalinganisha matendo yao na sheria hii, Amri zake kumi, " +
                            "ni dhahiri kama kweli wao ni raia waaminifu wa Ufalme wake, ama ikiwa ni wakosaji.\n\n" +
                            "MUNGU AJUA KILA TENDO NA WAZO LA KILA MTOTO WAKE.\n" +
                            "1. Je, MUNGU huchunguza matendo ya watoto wake? Je, MUNGU anayajua matendo yao?\n" +
                            "Ndiyo, anaona kila wanachokifanya. Vilevile anayajua yale yote wanayoyafikiri. Anayaona yale yaliyoko mioyoni. \"Kwani macho yake " +
                            "ya juu ya njia za mtu, Naye huiona miendo yake yote.\" Ayubu 34:21. MUNGU pia anayajua mambo ya upumbavu, yaani ile dhambi ambayo " +
                            "watoto wake wanaifanya. Daudi alisema, \"Ee MUNGU, unajua upumbavu wangu wala hukufichwa dhambi yangu.\" Zaburi 69: 5. Haidhuru giza " +
                            "liwe nene kiasi gani, haiwezekani kujificha ili MUNGU asikuone. (Zaburi 139:1,12). MUNGU pia anayajua mawazo ya mwanadamu. \"Umelifahamu " +
                            "wazo langu tokea mbali.\" Zaburi 139:2. \"Wewe, Bwana, ujuaye mioyo ya watu wote...\" Matendo 1:24.\n\n" +
                            "2. Je, MUNGU huyasahau yote waliyoyafanya watoto wake?\n" +
                            "La, MUNGU hasahau. \"Hakika sitazisahau kamwe kazi zao hata mojawapo.\" Amosi 8:7\n\n" +
                            "MATENDO YA MWANADAMU YAANDIKWA MBINGUNI.\n" +
                            "3. Kwa jinsi ambavyo MUNGU humwona kila mmoja, naye hasahau, kwa nini matendo yao yaandikwe mbinguni?\n" +
                            "MUNGU hana haja ya kumbukumbu kwani Yeye hasahau. Mwanadamu huyasahau. MUNGU atakapowaleta watoto wake hukumuni, mmoja wao aweza kuwa " +
                            "amesahau kuwa alitenda hili ama lile. \"Mara akasahau jinsi alivyo.\" Yakobo 1:24. Ama mmoja wa marafiki zake wanaweza kufikiri ya kwamba " +
                            "alikuwa mtawa sana hata asingeweza kutenda uovu. Angeweza kudhani ya kwamba MUNGU hakukumbuka vema. Ili kwamba kila mmoja apate kujua " +
                            "hakika ya kwamba MUNGU ni wa haki na wala hafanyi makosa, anavyo vitabu ambavyo ndani yake majina ya watoto Wake wote yameandikwa, na " +
                            "kumbukumbu ya matendo yao yote.\n\n" +
                            "4. Je, vinaitwaje vitabu vya MUNGU vya kuhifadhi kumbukumbu za watoto wake?\n\n" +
                            "Viko vitabu hivi mbinguni: KITABU CHA UZIMA, KITABU CHA UKUMBUSHO, na VITABU vilivyoandikwa MATENDO YA WANADAMU.\n\n" +
                            "(a) Katika kitatabu cha Uzima yameandikwa majina ya wale walioanza kumpenda MUNGU na kumtumikia. \"... ambao majina yao yamo katika " +
                            "KITABU CHA UZIMA.\" Wafilipi 4:3. \"... Na wakati huo watu wako wataokolewa; kila mmoja atakayeonekana ameandikwa katika kitabu kile. \"" +
                            "Danieli 12:1. \"Yeye ashindaye atavikwa hivyo mavazi meupe, wala sitalifuta kamwe jina lake katika kitabu cha uzima.\" Ufunuo 3:5.\n\n" +
                            "(b) KITABU CHA UKUMBUSHO: Wale ambao majina yao yamo katika kitabu cha uzima, pia matendo yao mema kwa MUNGU na kwa wanadamu yaweza kuwamo " +
                            "katika kitabu hiki cha ukumbusho. \"... Na kitabu cha Ukumbusho kikaandikwa mbele Zake, kwa ajili ya hao waliomcha Bwana, na kulitafakari " +
                            "Jina Lake.\" Malaki 3:16.\n\n" +
                            "(c) Vitabu ambavyo ndani yake matendo ya watu yameandikwa (Ufunuo 20:12)\n\n" +
                            "MAHALI PA HUKUMU.\n" +
                            "5. Ni nani atakayemhukumu mwanadamu?\n" +
                            "MUNGU Baba na YESU watashirikiana katika kazi ya kumhukumu mwanadamu. \"... Hukumu ikawekwa, na vitabu vikafunuliwa na mmoja aliye " +
                            "mfano wa mwanadamu akaja pamoja na mawingu ya mbingu akamkaribia huyo Mzee wa Siku, wakamleta karibu naye.\" Danieli 7: 10,13. \"Akatuagiza " +
                            "tuwahubiri watu na kushuhudia ya kuwa huyu ndiye aliyeamriwa na MUNGU awe mhukumu wa wahai na wafu.\" Matendo 10:42. \"Kwa maana " +
                            "imetupasa sis sote kudhibitisha mbele ya kiti cha hukumu cha KRISTO...\" 2 Wakorintho 5:10.\n\n" +
                            "6. Ni lini mwanadamu atakapohukumiwa?\n" +
                            "\"Kwa maana ameweka siku atakayowahukumu walimwengu kwa haki.\" Matendo 17:31. Ufunuo 14:6,7: \"Kisha nikaona malaika mwingine " +
                            "akiruka katikati ya mbingu, mwenye injili ya milele, awahubiri hao wakaao juu ya nchi, na kila taifa na kabila na lugha na jamaa, " +
                            "akasema kwa sauti kuu, mcheni MUNGU na kumtukuza kwa maana SAA YA HUKUMU YAKE IMEKUJA...\"\n" +
                            "Katika siku za mtume Yohana, hiyo siku ya hukumu ilikuwa bado iko mbele, bali kama Injili imekwenda katika mataifa yote, kama ilivyo leo " +
                            "hukumu \"Imekuja\". Hiyo injili, yaani hizo habari njema za wokovu kwa YESU, zimekwenda karibu katika kila nchi ulimwenguni.\n\n" +
                            "7. Ni watu wangapi watakaohukumiwa?\n" +
                            "WATU WOTE watahukumiwa. \"Kwa maana imetupasa sisi sote kudhihirisha mbele ya kiti cha hukumu cha KRISTO... \" 2 Wakorintho 5:10. \"MUNGU " +
                            "atawahukumu wenye haki na wasio na haki.\" Mhubiri 3:17. Haiwezekani kuwa wote wako mbinguni mbele ya kiti cha enzi cha MUNGU kwa vile wengi " +
                            "wa wale ambao ni wakuhukumiwa wamekuwa wafu. Walakini, majina yao yako huko pamoja na kumbukumbu la mafikara yao pamoja na matendo " +
                            "yao.\n\n" +
                            "8. Ni kina nani watakaokuwa mashahidi katika hiyo hukumu?\n" +
                            "MUNGU hahitaji mashahidi. Naye ajua yote yale mwanadamu aliyoyawaza ama aliyofanya. Kwa vyovyote, hiyo kumbukumbu ya matendo na mawazo yao " +
                            "iliyomo vitabuni yawashuhudia kuwa wema ama wabaya. Na malaika wale walioziandika hizo kumbukumbu za matendo na mawazo yao, vile vile " +
                            "wako pale kushuhudia. (Mathayo 18: 10).\n\n" +
                            "9. Ni nani mtetezi (wakili) awateteaye wanadamu katika hukumu hiyo?\n" +
                            "\"...Tunaye Mwombezi (wakili) kwa Baba, YESU Kristo mwenye haki.\" 1 Yohana 2:1. (Waebrania 4:15). YESU KRISTO alijaribiwa vile kama mwanadamu " +
                            "anavyojaribiwa. Ajua kuwahurumia wanadamu\n\n" +
                            "10. Je, mwanadamu atahukumiwa kwa kutumia kanuni gani?\n" +
                            "AMRI KUMI, ndizo kanuni ambazo kwazo matendo ya mtu yanalinganishwa katika hukumu. \"Hii ndiyo jumla ya maneno; yote yamekwisha sikiwa; " +
                            "Mche MUNGU, nawe uzishike amri zake, maana kwa jumla ndiyo impasayo mtu, kwa maana MUNGU ataleta hukumuni kila kazi, pamoja na kila " +
                            "neno la siri, likiwa jema au likiwa baya.\" Mhubiri 12:13,14.\n\n" +
                            "MATOKEO YA HIYO HUKUMU.\n\n" +
                            "11. Wanadamu watagawanywa mafungu mangapi kama matokeo ya hukumu hiyo?\n" +
                            "Wanadamu watagawanywa katika mafungu mawili. Kundi moja litakuwa ni la wale ambao dhambi zao zimefutwa katika vitabu vya kumbukumbu, na " +
                            "kundi jingine litakuwa la wale ambao majina yao yamefutwa katika kitabu cha uzima, pamoja na wale ambao hawakumpokea YESU, hivyo majina " +
                            "yao hayakuandikwa kabisa humo. Soma Isaya 43:25; Kutoka 32:33; 1 Yohana 1:9; Ufunuo 3:5.\n\n" +
                            "12. Hukumu itakapokuwa imemalizika kukatwa, YESU atatoa tamko gani?\n" +
                            "\"Mwenye kudhulumu na azidi kudhulumu; na mwenye uchafu na azidi kuwa mchafu; na mwenye haki na azidi kufanya haki; na mtakatifu na " +
                            "azidi kutakaswa.\" Ufunuo 22:11. Hapatakuwa na wakati wa mtu kuigeuza tena tabia yake, ama kumgeukia MUNGU. Mtu atakuwa tayari kwenda " +
                            "mbinguni ama kufa ndani ya dhambi zake. (Ufunuo 20:15).\n" +
                            "Je, YESU atamwambia Baba yake kwa ajili yako, \"Mtu huyu amekipokea kifo changu kwa ajili yake, ameziungama dhambi zake, naye anaishi " +
                            "kufuatia sawa na sheria zangu\"? Ama, utakuwa mmoja wa wale ambao watabaki wakiendelea na kuzidi \"Kudhulumu\" na kutupwa katika ziwa la " +
                            "moto?\n" +
                            "Uhakikishe sasa ya kwamba jina lako liko katika kitabu cha UZIMA na ya kwamba pamoja na msaada wa YESU litabaki humo. Kisha maneno " +
                            "haya ya mibaraka yatasemwa kwako \"Njoni, mliobarikiwa na Baba yangu, urithini ufalme mliowekewa tangu kuumbwa ulimwengu ...\" " +
                            "Mathayo 25:34.\n\n"
                    /*"Maswali ya Somo la 8"*/),
            new Lessons("Somo la 9", "Je, Wafu Wako Mbinguni, Ahera ama Wako Jehanamu?",
                    "Fungu la kukariri: \"Bwana awaongoze mioyo yenu mkapate pendo la MUNGU, na subira ya KRISTO\". 2 Wathesalonike 3:5.\n\n" +
                            "UTANGULIZI.\n\n" +
                            "MUNGU ametupa ahadi mbili: UZIMA WA MILELE kwa watoto Wake waaminifu, na KIFO kwa wale watoto waasi. Sasa mwanadamu anangojea MUNGU " +
                            "aitimize ahadi yake. Wengi wamengojea kwa miaka elfu nyingi, kwa kuwa ulimwengu huu sasa una umri wa zaidi ya miaka 6,000. Adamu aliishi " +
                            "miaka 930 (Mwanzo 5:5). Je, tangu kufa kwake, amekuwa akiingojea wapi? Ni wapi Ibrahimu, Daudi na Danieli na watakatifu wengine wote " +
                            "wanapoingojea ahadi hii? Je, wale waovu wamekuwa wakingojea ahadi hii wakiwa wapi? Yaangalie majawabu ya maswali haya.\n\n" +
                            "1. MUNGU alimuumba mwanadamu kwa kutumia nini?\n\n" +
                            "\"Bwana MUNGU akamfanya mtu kwa mavumbi ya ardhi, akampulizia puani pumzi ya uhai; mtu akawa nafsi hai\". Mwanzo 2:7. Kabla MUNGU " +
                            "hajampulizia Adamu pumzi ya uhai puani, Adamu alikuwa nini? Alikuwa mavumbi ya ardhi. Baada ya hiyo pumzi kuongezwa katika mavumbi hayo, " +
                            "Adamu akawa nafsi hai, kiumbe kiishicho.\n\n" +
                            "2. Jambo gani linalotukia kwa pumzi ya mtu anapokufa?\n\n" +
                            "Pumzi hiyo humwacha. Humtoka. \"Pumzi yake hutoka, huurudia udongo wake.\" Zaburi 146:4. Ikiwa pumzi imemtoka, ni mavumbi tu yanayobaki.\n\n" +
                            "3. Ikiwa mtu akifa, anajua nini zaidi?\n\n" +
                            "Hajui lolote. \"Pumzi yake hutoka, huurudia udongo wake, siku hiyo mawazo yake yapotea\". Zaburi 146:4. Toka fungu hilo umejifunza " +
                            "mambo matatu; \n" +
                            "(a) mtu afapo, pumzi yake humtoka. \n" +
                            "(b) hurudi mavumbini alikotoka, \n" +
                            "(c) Mawazo yake hupotea. Hajui lolote.\n" +
                            "Adamu alipoumbwa kabla ya kupewa pumzi, hakujua lolote. Pumzi haikujua lolote, bali pumzi ile ilipochanganywa na mavumbi, Adamu akawa " +
                            "kiumbe hai. Mtu afapo, pumzi yake hutoka. Pumzi hiyo ingali haijui lo lote. Mavumbi yabakiyo hayajui kitu azikwapo. Airudia ardhi, pumzi " +
                            "ile ambayo mwanzo MUNGU aliitia ndani yake, ameichukua. Mtu anakuwa kama hakuwako. (Mhubiri 12:7)\n\n" +
                            "4.Pumzi ya mwanadamu ina jina gani jingine?\n\n" +
                            "Ayubu alisema juu ya pumzi yake kuwa ni roho. \"Kwa kuwa uhai wangu ukali mzima ndani yangu, na Roho ya MUNGU i katika pua yangu\" " +
                            "Ayubu 27:3\n\n" +
                            "HALI YA MWANADAMU KATIKA WAFU.\n\n" +
                            "5. Sulemani asema nini juu ya hali ya mwanadamu akifa?\n\n" +
                            "\"... Walio hai wajua ya kwamba watakufa; lakini wafu hawajui neno lolote ...\" Mhubiri 9:5. Wafu hawajui jambo lo lote litukialo juu " +
                            "ya nchi. Ayubu asema \"Wanawe hufikiria heshima, wala yeye hawajui; kisha wao huaibishwa lakini yeye hana habari zao\". Ayubu 14:21. " +
                            "\"Mapenzi yao na machukio yao na husuda yao imepotea yote pamoja...\" Mhubiri 9:6.\n\n" +
                            "6. Je, aweza kulikumbuka neno lo lote linalotukia kabla ya kufa kwake?\n\n" +
                            "La, hawezi kukumbuka kabisa. \"... wafu hawajui lo lote ... maana kumbukumbu lao limesahauliwa.\" Mhubiri 9:5\n\n" +
                            "7. Je, mtu aliyekufa ana sehemu iwayo yote katika jambo lo lote litendekalo duniani?\n\n" +
                            "La hasha! Hana sehemu iwayo yote katika kitu kiwacho chote! \"... wala hana sehemu tena katika jambo lo lote linalofanyika chini ya jua.\"" +
                            "Mhubiri 9:6. Je, aweza kwa njia yo yote kuwaongoza walio hai? Je, aweza kurudi na kuwasaidia ama kuwapendeza ama kuwaloga? La!\n\n" +
                            "JE, WAFU WAKO MBINGUNI AMA WAKO AHERA (JEHANAMU)?\n\n" +
                            "8. Daudi Asema Nini Juu Ya Wafu?\n\n" +
                            "(a) \"Sio wafu wamsifuo Bwana, wala wo wote washukao kwenye kimya\" Zaburi 115:17. Je, laiti wafu wangekuwa mbinguni, wasingemsifu " +
                            "MUNGU?\n" +
                            "(b) \"Maana mautini hapana kumbukumbu lako; katika kuzimu ni nani atakayekushukuru?\" Zaburi 6:5. Je, MUNGU angependa awe na watu huko mbinguni " +
                            "ambao hawawezi kumsifu wala kumkumbuka wala kumpa shukrani? La. Wala waovu hawaendelei kuteketea kuzimuni kama wengine waaminivyo. " +
                            "Kwa hiyo, wafu hawako mbinguni kamwe wala hawateseki ndani ya moto. Wamerudi mavumbini. \"Huko waovu huacha kusumbua; huko nako hao " +
                            "waliochoka wapumzika.\" Ayubu 3:17. Hakungalikuwa na pumziko ikiwa wangalikuwa wakiteketea motoni. Wao pia wameirudia ardhi, ambako " +
                            "toka huko walichukuliwa. (Mwanzo 3:19).\n\n" +
                            "UONGO WA SHETANI\n\n" +
                            "9. Shetani Kwanza Alimdanganyaje Adamu?\n\n" +
                            "MUNGU alimwambia Adamu na Hawa kwamba wangekufa hakika, kama wangalikula matunda ya mti huo waliokatazwa. Je, Shetani alisemaje? \"" +
                            "Hakika hamtakufa\". Mwanzo 2:17; 3:4. Twajua ya kwamba hili si kweli, kwani Mtume Paulo alisema hivi; \"Mshahara wa dhambi ni mauti.\"" +
                            " Warumi 6:23. Katika siku za zamani na sasa, watu wanadhani ya kwamba, kwa kumpata mtu ambaye ni hodari katika ibada za mashetani " +
                            "wanaweza kuzungumza na jamaa zao waliokufa, wao waweza kupata habari toka kwao. Je, MUNGU aliwaonyaje wana wa Israeli juu ya jambo hili? " +
                            "\"Asionekane kwao mtu ... atazamaye bao, wala mtu atazamaye nyakati mbaya, wala mwenye kubashiri, wala msihiri, wala mtu alogaye kwa " +
                            "kupiga mafundo, wala mtu apandishaye pepo, wala mchawi, wala mtu awaombaye wafu. Kwa maana mtu atendaye hayo ni chukizo kwa Bwana.\" " +
                            "Kumbukumbu La Torati 18:10-12. Ni kweli kabisa kwamba watu husema na roho ambazo zaonekana kuwa ni jamaa zao waliokufa ama marafiki zao, " +
                            "bali roho hizo ni nini? SIYO WALE WALIOKUFA. Ni akina nani basi? Paulo asema katika 1 Timotheo 4:1 \"... wengi watajitenga na imani " +
                            "wakisikiliza roho zidanganyazo, na mafundisho ya mashetani.\" SHETANI ni kiumbe mwigizaji mwenye akili sana. Anawajua wale wafu walikuwa " +
                            "namna gani, na vile walivyokuwa wakiongea, na vile walivyokuwa katika desturi ya kusema. Ajaribu kwanza - \"Hakika hamtakufa\".\n\n" +
                            "NI MUNGU PEKE YAKE NDIYE HAFI.\n\n" +
                            "10. Paulo asemaje juu ya uhai wa MUNGU?\n\n" +
                            "\"Mfalme wa wafalme, Bwana wa mabwana; ambaye Yeye peke yake hapatikani na mauti\" 1 Timotheo 6:15-16. Mwanadamu ni kiumbe kiwezacho " +
                            "kufa. MUNGU peke yake ndiye asiyeweza kufa. Hafi.\n\n" +
                            "JE, MWANADAMU ATAISHI TENA?\n\n" +
                            "11. Je, wale waliokufa, wataishi tena?\n\n" +
                            "Ndiyo, waliokufa wataishi tena. \"...Saa yaja ambayo watu wote WALIOMO MAKABURINI watasikia sauti yake. Nao watatoka; wale waliofanya " +
                            "mema kwa ufufuo wa uzima, na wale waliotenda mabaya kwa ufufuo wa hukumu.\" Yohana 5: 28,29. Wengine wataishi pamoja naye milele, bali " +
                            "wale waovu wataangamizwa.\n\n" +
                            "WAFU WATAISHI LINI TENA?\n\n" +
                            "12. YESU atawafanyia nini wale wafu wenye haki atakapokuja tena?\n\n" +
                            "\"Kwa sababu Bwana mwenyewe atashuka kutoka mbinguni ... nao waliokufa katika Kristo watafufuliwa kwanza.\" Wathesalonike 4:16.\n\n" +
                            "13. Wale wafu waovu wataishi lini tena?\n\n" +
                            "Wale wafu waovu wataishi tena, baada ya miaka 1000. Ufunuo 20:4,5.\n" +
                            "Je, utakuwa pamoja na watakatifu YESU atakapokuja, ama utafufuliwa baada ya miaka elfu moja, pamoja na waovu? YESU hawezi kukukatia " +
                            "shauri wewe. Mchungaji wako hawezi kukukatia shauri. Watu wa nyumbani kwako hawawezi kabisa kukukatia shauri. Je, Maamuzi yako ni yapi?\n\n"
                    /*"Maswali ya Somo la 9."*/),
            new Lessons("Somo la 10","MUNGU Awachukua watoto wake Mbinguni",
                    "Fungu la Kukariri: \"... Naenda kuwaandalia mahali. Basi mimi nikienda na kuwaandalia mahali, nitakuja tena niwakaribishe " +
                            "kwangu.\". Yohana 14:2,3.\n\n" +
                            "UTANGULIZI\n\n" +
                            "Kuna unabii mwingi sana unaoelezea kuja kwa YESU mara ya kwanza. Hivyo, kuna unabii mwingine pia juu ya kuja kwake mara ya " +
                            "pili. Jambo hili la kwamba alikuja mara ya kwanza ni uthibitisho ya kwamba yuaja tena mara ya pili. \"Kadhalika KRISTO naye, " +
                            "akiisha kutolewa sadama mara moja azichukue dhambi za watu wengi, atatokea mara ya pili, pasipo dhambi, kwa hao wamtazamiao kwa " +
                            "wokovu.\" Waebrania 9:28. Kama hatakuja mara ya pili, kuja kwake mara ya kwanza hakukuwa na kazi kabisa!.\n\n" +
                            "WAANDISHI WA BIBLIA WAAMINI YA KWAMBA YESU ATAKUJA MARA YA PILI.\n\n" +
                            "1. Ni nani kwanza aliyetabiri kwa mara ya kwanza kuhusu kuja kwa YESU mara ya pili?\n\n" +
                            "\"Na Henoko, mtu wa saba baada ya Adamu, alitoa maneno ya unabii juu ya hao, akasema, Angalia, Bwana atakuja na watakatifu wake, " +
                            "maelfu.\" Yuda 14.\n\n" +
                            "2. Ayubu aliyaelezaje kuhusu matumaini yake juu ya kuja kwa YESU?\n\n" +
                            "\"Ila namjua mkombozi wangu yu hai, naye mwisho atasimama juu ya nchi. Nami baada ya ngozi yangu kuharibiwa hivi, lakini katika " +
                            "mwili wangu nitamwona MUNGU.\" Ayubu 19:25,26.\n\n" +
                            "JINSI YESU ATAKAVYOKUJA\n\n" +
                            "3. YESU alitoa tahadhari gani kuhusu waeneza uongo juu ya kuja kwake?\n\n" +
                            "\"Wakati huo mtu akikwambia, tazama, Kristo yupo hapa, au yuko kule, msisadiki. Kwa maana watatokea makristo wa uongo, na manabii " +
                            "wa uongo, nao watatoa ishara kubwa na maajabu; wapate kuwapoteza kama yumkini, hata walio wateule. Tazama nimekwisha kuwaonya mbele. Basi " +
                            "wakiwaambia, yuko jangwani, msitoke, yumo nyumbani, msisadiki.\" Mathayo 25:23-25. YESU hatakuja kwa siri.\n" +
                            "Yeye mwenyewe asema hivi juu ya kuja kwake; \"Kwa maana, kama vile umeme utokavyo mashariki ukaonekana hata magharibi, hivyo ndivyo " +
                            "kutakavyokuwa kuja kwake mwana wa Adamu.\" Mathayo 24:27. Umeme huonekana na kila mtu? Ndiyo, hautokei mahali pa siri ama katika pembe " +
                            "moja tu ya giza! Bali huonekana kila mahali. \"Tazama yuaja na mawingu; NA KILA JICHO litamwona.\" Ufunuo 1:7. YESU alipokuwa akipaa " +
                            "kwenda zake mbinguni, wengi walimwona akienda. Luka asema kwamba, wingu lilimpokea kutoka machoni pao, na ya kwamba malaika wawili " +
                            "walitokea, wakasema, \"Enyi watu wa Galilaya, mbona mmesimama mkitazama mbinguni? Huyu YESU aliyechukuliwa kutoka kwenu kwenda juu " +
                            "mbinguni, atakuja jinsi iyo hiyo mlivyomwona akienda zake mbinguni.\" Matendo 1:11\n\n" +
                            "4. Je, wote watakuwa wakikutazamia kuja kwake?\n\n" +
                            "La! Kwa wale ambao hawamtazamii, yuaja bila kutarajiwa, kama vile mwivi ajavyo usiku (1 Wathesalonike 5:2).\n" +
                            "Kwa wale ambao wanamtazamia, kwa vyovyote kwao haji kama mwivi, watamlaki mawinguni. (1 Wathesalonike 5: 3,4).\n\n" +
                            "5. Watu watakuwa wakifanya nini YESU ajapo?\n\n" +
                            "\"Na kadhalika, kama ilivyokuwa katika siku za Lutu, walikuwa wakila na kunywa, walikuwa wakinunua na kuuza, wakipanda na kujenga; lakini " +
                            "siku ile Lutu aliyotoka Sodoma, kulikunya moto na kiberiti kutoka mbinguni vikawaangamiza wote. Hivyo ndivyo itakavyokuwa siku ile " +
                            "atakayofunuliwa Mwana wa Adamu.\" Luka 17:28-30.\n" +
                            "Hii haioneshi ya kwamba kula au kuyatenda mambo haya yote yaliyotajwa ni makosa, bali yaonesha kwamba, watu watakuwa wakiendelea " +
                            "kujishughulisha na mambo waliyozoea kuyatenda kama kawaida, YESU atakapokuja.\n\n" +
                            "6. Je, Kuna mtu yeyote aijuaye hiyo siku hasa ya kuja kwa YESU?\n\n" +
                            "Hakuna aijuaye siku wala saa ile. \"Walakini habari ya siku ile na saa ile, hakuna aijuaye, hata malaika walio mbinguni, wala Mwana, " +
                            "ila Baba peke yake.\" Mathayo 24:36.\n\n" +
                            "7. Ingawa mwanadamu haijui hiyo siku ya kuja Kwake, Je, anaweza kujua mtu ya kwamba kuja Kwake ni karibu?\n\n" +
                            "Ndiyo, aweza kujua. Tuzionapo ishara za kuja kwake zikitimia, twajua ya kwamba kuja kwake ni karibu. \"Nanyi kadhalika, myaonapo hayo " +
                            "yote, tambueni ya kuwa yu karibu, milangoni.\" Mathayo 24:23. Je, rafiki yako asimamapo mlangoni, huchukua muda mrefu ama kukawia kabla " +
                            "ya kuingia nyumbani mwako? Wanafunzi wa YESU walimuuliza kama dalili za kuja kwake zilikuwa nini? Katika kuwajibu aliwapa dalili nyingi " +
                            "kama zilivyoandikwa katika kitabu cha Mathayo sura ya 24.\n" +
                            "(a) \"Nanyi mtasikia habari za vita na matetesi ya vita; ... taifa litaondoka kupigana na taifa, na ufalme kupigana na ufalme.\" (f. 6,7)\n" +
                            "(b) \"Kutakuwa na njaa, na matetemeko ya nchi mahali mahali.\" (f.7)\n" +
                            "(c) \"Na kwa sababu ya kuongezeka maasi, upendo wa wengi utapoa. \" (f.12) (soma pia 2 Timotheo 3:1-5)\n" +
                            "(d) \"Kwa maana watatokea makristo wa uongo, na manabii wa uongo.\" (f.24). \"Jua litatiwa giza, na mwezi hautatoa mwanga wake na " +
                            "nyota zitaanguka mbinguni.\" (f.29)\n" +
                            "(e) Jua lilitiwa giza tarehe 19 Mei, 1780. Usiku wa tarehe hiyo MWEZI haukutoa mwanga wake. NYOTA zilianguka tarehe 13 November, 1833. " +
                            "Habari hizi zote zimeandikwa katika \"Encyclopaedia Britannica.\"\n" +
                            "(f) \"Habari njema ya ufalme itahubiriwa katika ulimwengu wote, kuwa ushuhuda kwa mataifa yote; hapo ndipo ule mwisho utakapokuja.\" (f.14)\n\n" +
                            "8. Ni jambo gani litakalotukia kwa wale waovu YESU ajapo?\n\n" +
                            "\"Hapo ndipo atakapofunuliwa yule asi, ambaye Bwana YESU atamwua kwa pumzi ya kinywa chake, na kumwangamiza kwa ufunuo wa kuwapo kwake.\" " +
                            "2 Wathesalonike 2:8. Wale wafu walioko katika makaburi watabaki mumo humo kwa miaka elfu moja mingine hali wale watakatifu wakiwa " +
                            "mbinguni pamoja na MUNGU. \"Nao wakawa hai (wenye haki), Wakatawala pamoja na KRISTO miaka elfu. Hao wafu waliosalia (waovu) hawakuwa " +
                            "hai, hata itimie ile miaka elfu\". Ufunuo 20:4,5. (Soma pia Ufunuo 20:7,9,10 na 21:1-4). Baada ya maharibifu haya, ambayo yataitakasa nchi, " +
                            "watakatifu wataishi katika dunia hii milele.\n" +
                            "Je, YESU atakapokuja, utakuwa mmoja wa wale wasiotii, wale watakaoiambia miamba na milima \"Tuangukieni, tusitirini, mbele ya uso wake " +
                            "Yeye aketiye juu ya kiti cha enzi, na hasira ya Mwana Kondoo. Kwa maana siku iliyo kuu, ya hasira yake, imekuja; naye ni nani awezaye " +
                            "kusimama?\". Ufunuo 6:16,17. Ama utakuwa mmoja wa wale wana watiifu wa MUNGU ambao, atakapokuwa akija, wataangalia juu na kusema, \"Tazama, " +
                            "huyu ndiye MUNGU wetu, Ndiye tuliyemgoja atusaidie; Huyu ndiye Bwana tuliyengoja na tushangilie na kuufurahia wokovu wake.\" Isaya 25:9. " +
                            "Je, itakuwaje?\n\n"
                    /*"Maswali ya Somo la 10"*/),
            new Lessons("Soma la 11","Mazoea ya Afya kwa watoto wa MUNGU",
                    "Fungu la kukariri: \"Basi, mlapo, au mnywapo, au mtendapo neno lo lote, Fanyeni yote kwa utukufu wa MUNGU.\" 1 Wakorintho 10:31.\n\n" +
                            "UTANGULIZI\n\n" +
                            "Mara kwa mara watu hudhani ya kwamba haileti tofauti iwayo yote juu ya mtu alavyo ama vile anavyokunywa; na ya kwamba haileti tofauti " +
                            "yoyote ya jinsi mtu autunzavyo mwili wake ama asipoutunza! Na ya kwamba mambo kama hayo hayahusiani kabisa na uchaji wa MUNGU. Bali ni " +
                            "mambo binafsi ya huyo mtu mwenyewe. Mtu kama huyu hajalisoma Neno la MUNGU ama amekuwa mvivu katika kulisoma. Bila afya, hakuna hata mmoja " +
                            "awezaye kujitimizia wajibu wake mwenyewe kwa ukamilifu, kwa jamaa zake na kwa Muumba wake, kwa hivyo, \"afya ingetunzwa kwa makini kama " +
                            "ilivyo kwa tabia.\" (Education uk. 195)\n\n" +
                            "KUSUDI LA MUNGU KWA MWANADAMU.\n\n" +
                            "1. Mwanadamu aliumbwa katika hali gani?\n\n" +
                            "MUNGU hakumwumba mwanadamu mwoga au dhaifu, kiumbe aliye na magonjwa. Alimwumba katika SURA YAKE MWENYEWE. \"MUNGU, amemfanya mwanadamu " +
                            "MNYOFU.\" Mhubiri 7:29.\n" +
                            "Kwa ajili ya dhambi, mwanadamu alipoteza utawala wake kwa Shetani, ilibidi akombolewe na YESU. Gharama ya ukombozi huo ilikuwa ni " +
                            "nini basi? Damu yake Mwenyewe. \"Maana MLINUNULIWA kwa thamani. Sasa basi mtukuzeni MUNGU katika miili yenu.\" 1 Wakorintho 6:20. Kwa " +
                            "vile MUNGU ndiye aliuumba mwili wa mtu, na kwa sababu YESU aliukomboa, mwili huo ni mali yake. Si mali ya huyo mtu ili atende kadiri " +
                            "anavyotaka yeye.\n\n" +
                            "2. MUNGU anasema nini kuhusu mapenzi yake kwa mwanadamu?\n\n" +
                            "\"Mpenzi, naomba ufanikiwe katika mambo yote na kuwa na afya yako, kama vile roho ifanikiwavyo.\" 3 Yohana 2.\n" +
                            "Maisha ya afya bora ni ya lazima sana kwa ukamilifu wa tabia ya Kikristo na kwa usitawi wa mwili na nguvu za ubongo na mwili.\n" +
                            "Kwa nini mwanadamu hana haki ya kuutumia mwili wake vibaya? \"Au hamjui ya kuwa mwili wenu ni hekalu la Roho Mtakatifu aliye ndani yeni, " +
                            "mliyepewa na MUNGU? Wala ninyi si mali yenu wenyewe.\" 1 Wakorintho 6:19. Kisha Paulo katika 1 Wakorintho 3:16 anasema \"" +
                            "Hamjui ya kuwa ninyi mmekuwa hekalu la MUNGU, na ya kuwa Roho wa MUNGU anakaa ndani yenu?\"\n\n" +
                            "3. Paulo anasema nini juu ya kuutunza mwili wake?\n\n" +
                            "\"Basi nautesa mwili wangu na kuutumikisha; isiwe, nikiisha kuwahubiri wengine, mwenyewe niwe mtu wa kukataliwa.\" 1 Wakorintho 9:27. " +
                            "Mwili una mafikara mabaya, unayahangaikia mambo mengi ambayo MUNGU asingeyahesabu kuwa yake. Mwili hauna budi kutiishwa. Ni lazima mwili " +
                            "usimtawale mtu.\n\n" +
                            "4. Paulo aliwaasa wakristo wangeifanyia nini miili yao?\n\n" +
                            "\"Basi,ndugu zangu, nawasihi, kwa huruma zake MUNGU, itoeni miili yenu iwe dhabihu iliyo hai, takatifu, ya kumpendeza MUNGU, ndio ibada " +
                            "yenu yenye maana\" Warumi 12:1.\n\n" +
                            "5. Ni kiwango gani cha adhabu kitatolewa ipimwayo kwa wale waiharibuo miili yao?\n\n" +
                            "\"Kama mtu akiliharibu hekalu la MUNGU, MUNGU atamharibu mtu huyo. Kwa maana hekalu la MUNGU ni takatifu, ambalo ndio ninyi.\" " +
                            "1 Wakorintho 3:17.\n\n" +
                            "6. Mwili unahitaji nini ili uwe na afya?\n\n" +
                            "Mwili wahitaji mwanga wa jua, hewa safi, na maji salama na mavazi ambayo ni bora kwa kuutia joto mwafaka, mazoezi, pumziko, chakula " +
                            "bora na kuzuri kwa afya, utulivu wa ubongo. Mengine kati ya haya yametajwa katika Biblia. Elimu ya utabibu imegundua ya kwamba mambo " +
                            "haya yote yanaongeza afya.\n" +
                            "Hapo mwanzo MUNGU lipomuumba mtu, alimpa matunda, nafaka, na vitu vingine kama nazi, jamii ya kunde, na njugu. \"MUNGU akasema, Tazama, nime" +
                            "wapa kila mche utoao mbegu, ulio juu ya uso wa nchi pia, na kila mti ambao matunda yake yana mbegu; yatakuwa ndiyo chakula chenu.\" " +
                            "Mwanzo 1:29.\n" +
                            "MUNGU alijua ya kwamba vyakula namna ile vingefanya maisha ya mwanadamu kuwa marefu. Mtu aliweza kuishi kwa umri wa miaka takribani " +
                            "elfu moja (1,000) siku zile. Dhambi ilipoingia, MUNGU alitoa pia mboga zitumike kama chakula. \"Nawe utakula mboga za kondeni.\" " +
                            "Mwanzo 3:18.\n" +
                            "Baadaye, MUNGU alipoviharibu vitu vyote na mimea iliyokuwepo juu ya uso wa dunia kwa gharika, alimruhusu mwanadamu kula nyama pia. " +
                            "Mwanzo 9:3.\n\n" +
                            "WANYAMA SAFI: Ni wale walio na kwato zilizogawanyika kati na pia wawe ni wenye kucheu, kama kwa ng'ombe, kondoo na paa. Wale ambao " +
                            "kwato zao hazikupasuliwa kati wala hawacheui ni najisi, hawaliwi. (Kumbukumbu la Torati 14:4-7). Nguruwe pamoja na kupendwa sana " +
                            "kuliwa na watu amekatazwa katika Biblia. (Mambo ya Walawi 11:7). \"Na nguruwe, kwa sababu yeye anazo kwato, ni mwenye miguu iliyopasuka " +
                            "kati, lakini hacheui, yeye ni najisi kwenu.\" Kumbukumbu la Torati 14:8. Mwanadamu anakatazwa hata kuigusa mizoga yao... \"Msile nyama " +
                            "zao, wala mizoga yao msiiguse\" Kwa nini? Nguruwe anayo minyoo midogomidogo iitwayo \"TRICHINAE\" iingiayo mwilini mwa mwanadamu kwa njia " +
                            "ya kula nyama ya nguruwe na huleta maradhi makubwa. Ni minyoo midogo mno kiasi kwamba haiwezi kuonekana kwa macho kwa wale wauzaji ama na yule " +
                            "anayeila, bali huleta ugonjwa. Ugonjwa huu unaitwa \"TRICHINOSIS\" uletwao na ulaji wa nyama ya nguruwe. Wengine hudai ya kwamba tangu YESU " +
                            "alipokufa msalabani watu wana uhuru wa kula nyama ya nguruwe. Je, YESU alikufa msalabani kweli ili kuondoa viini vya ugonjwa katika nyama " +
                            "ya nguruwe? La hasha. YESU alikufa ili kuwaokoa wanadamu, si kwa ajili ya kutakasa wanyama walio najisi. Isaya asema ya kwamba YESU ajapo " +
                            "atawaangamiza wale wote walao nyama ya nguruwe. (Isaya 66:15-17)\n\n" +
                            "SAMAKI SAFI: Samaki safi ni wale wenye magamba na mapezi. Mambo ya Walawi 11:9\n\n" +
                            "NDEGE SAFI. Wale ndege wanaokula na kusafisha uchafu, ambao wanakula nyama na mizoga ya wanyama au ndege wengine, wamekatazwa wasiliwe. " +
                            "Wengi wametajwa majina yao (Mambo ya Walawi 11:13-20).\n\n" +
                            "TUMBAKU: Watoto wa MUNGU wanatakiwa wasiiharibu miili yao kwa njia iwayo yote. \"Lisiwe katikati yenu shina lizaalo uchungu na pakanga.\" " +
                            "Kumbukumbu la Torati 29:18. Tumbako ina sumu nyingi sana, kuu ya hizo ni \"NICOTINE\". Nusu ya tone moja ya Nicotine yatosha kumwua mtu. " +
                            "Tumbaku inadhuru moyo, ini tumbo, mapafu, na sehemu nyingine za mwili. Huupumbaza ubongo. Imethibitishwa ya kwamba wale wasiotumia " +
                            "tumbaku wanaishi maisha marefu zaidi ya watu wanaotumia tumbaku kwa theluthi ya umri. Kweli, wengine kati ya hawa wanaotumia tumbaku " +
                            "wameishi maisha marefu pia bali jambo hili linatokea kwa nadra sana siyo la kawaida.\n\n" +
                            "MAJANI YA CHAI NA KAHAWA: Kawaida nyingine ambayo haiwezi kumletea MUNGU utukufu ni hii ya utumiaji wa majani ya Chai na Kahawa.\n" +
                            "Vinywaji hivi vyote ni sumu na utumiaji wake ni dhambi. Chai inazo sumu mbili, sumu ya THEIN na CAFFEINE, pia na TANNIC ACID. Kahawa inayo " +
                            "smu ya aina ya CAFFEINE. MUNGU hapendelei watoto wake kuziingiza sumu kama hizi katika miili yao.\n\n" +
                            "VILEO: \"Mvinyo hudhihaki, kileo huleta ugomvi; na akosaye kwa vitu hivyo hana hakima.\" Mithali 20:1. Pia asema \"Usiitazame mvinyo " +
                            "iwapo ni nyekundu; iitiapo bilauri rangi yake, ishukapo, taratibu; mwisho wake huuma kama nyoka; huchoma kama fira.\" Mithali 23:31,32.\n" +
                            "Nabii Habakuki anatangaza Ole, ama Laana, kwake yeye ampaye mwenziwe kileo kama hicho. \"Ole wake yeye ampaye jirani yake kileo, wewe " +
                            "utiapo sumu yako na kumlevya pia...\" Habakuki 2:15.\n\n" +
                            "UTULIVU WA UBONGO: Utulivu wa ubongo vile vile huleta afya. Magonjwa mengi katika dunia hii husababishwa na hofu na wasiwasi na hutomtumaini " +
                            "MUNGU.\" \"Moyo uliochangamka ni dawa nzuri.\" Mithali 17:22.\n\n" +
                            "\t\t\tSHUKRANI\n" +
                            "Ni shukrani nyingi kiasi gani tungekuwa nayo kutambua kwamba huyu MUNGU aliyetuumba anatujali na kututunza sana kiasi cha kutuonya na " +
                            "hatari mbalimbali. Vitu vile ambavyo Biblia inavikataza, mtoto wa MUNGU anakataa kuvitumia. Vile vitu ambavyo elimu ya uganga imegundua kuwa " +
                            "vina madhara, pia vile vile atavikataa. Atataka kumletea MUNGU utukufu kwa yale yote anayoyatenda.\n\n"
                    /*"Maswali ya Somo la 11"*/),
            new Lessons("Somo la 12", "Kurudisha Zaka ni Haki, Inaleta Mbaraka",
                    "Fungu la Kukariri: \"Je, Mwanadamu atamwibia MUNGU? Lakini ninyi mnaniibia mimi. Lakini ninyi mwasema, Tumekuibia kwa namna gani? Mme" +
                            "niibia ZAKA na SADAKA.\"Malaki 3:8.\n\n" +
                            "UTANGULIZI\n\n" +
                            "Kitabu cha MUNGU kinatuambia hivi: \"Maana shina moja la mabaya ya kila namna ni kupenda fedha.\" 1 Timotheo 6:10. Watumishi wa MUNGU " +
                            "na watumishi wa Shetani watatambulikana wazi kwa hali zao kuhusiana na fedha. Wanafunzi wa kwanza wa Kristo walitambua ya kwamba " +
                            "walinunuliwa kwa damu ya mwana wa MUNGU; kwa hivyo, hakuna hata mmoja aliyezihesabu fedha zake ama utajiri wake kuwa wake mwenyewe. " +
                            "Walijihesabu wenyewe kuwa kama mawakili na wasimamizi wa mali ya MUNGU. Wakihitajiwa kuutumia utajiri wao waliopewa na MUNGU kwa kuwafaidia " +
                            "wengine.\n\n" +
                            "MUNGU, JE! NI MHITAJI?\n\n" +
                            "1. Je, Nguvu za kupatia utajiri zatoka kwa nani?\n\n" +
                            "\"Bali utamkumbuka Bwana, MUNGU wako maana ndiye akupaye nguvu za kupata utajiri.\" Kumbukumbu la Torati 8:18. MUNGU, kwanza kama Muumba, " +
                            "na pili kama Mkombozi, anayo haki na dunia yote. Aliwaambia wana wa Israeli: \"Nayo nchi haitauzwa kabisa kabisa; kwani nchi ni yangu " +
                            "Mimi. Maana ninyi ni wageni na wasafiri wangu.\" Mambo ya Walawi 25:23. \"Tazama mbingu ni mali ya Bwana, MUNGU wako, na mbingu za mbingu, na " +
                            "nchi na vitu vyote vilivyomo.\" Kumbukumbu la Torati 10:14. \"Fedha ni mali yangu, na dhahabu ni mali yangu, asema Bwana wa majeshi.\" " +
                            "Hagai 2:8.\n\n" +
                            "2. Ingawa vitu vyote ni mali ya MUNGU, Je, Hali ya KRISTO alipokuwa katika dunia hii ilikuwaje?\n\n" +
                            "\"YESU akamwambia, Mbweha wana pango, na ndege wa angani wana viota, lakini Mwana wa Adamu hana pa kujilaza kichwa chake.\" Luka 9:58. " +
                            "Jinsi Kristo alivyokuwa maskinni katika dunia hii, ingawa Yeye ndiye aliyeviumba vitu vyote, vivyo na kazi ya MUNGU ulimwenguni, ipo " +
                            "katika hitaji kuu.\n" +
                            "MUNGU anataka Zaka ziletwe katika nyumba yake, kusaidia katika kazi Yake ya injili. \"Leteni Zaka kamili ghalani, ili kiweko chakula " +
                            "katika nyumba yangu...\" Malaki 3:10\n\n" +
                            "3. Adhabu gani ya kuogofya inaambatana na wale wanaokosa kutoa fungu la kumi?\n\n" +
                            "\"Ninyi mmelaaniwa kwa laana; maana mnaniibia Mimi...\" Malaki 3:9. Laana hii si kazi ya MUNGU; bali ni matokeo ya " +
                            "desturi za kibinadamu bila baraka ya pekee ya MUNGU.\n\n" +
                            "4. Ni jambo gani linalotuonesha ya kwamba kumnyang'anya MUNGU kwa nguvu katika sehemu ya mapato, huleta laana juu ya kunyesha kwa " +
                            "mvua na juu ya mimea?\n\n" +
                            "\"... Zitafakarini njia zenu. Mmepanda mbegu nyingi mkavuna kidogo, mnakula lakini hamshibi; mnakunywa lakini hamkujazwa na vinywaji; " +
                            "mnajivika nguo lakini hapana aonaye moto; na yeye apataye mshahara apata ili kuutia katika mfuko uliotobokatoboka. Bwana wa Majeshi asema hivi, " +
                            "zitafakarini njia zenu ... mlitazamia vingi kumbe vikatokea vichache, tena asema Bwana wa Majeshi. Ni kwa Sababu ya nyumba yangu inayokaa " +
                            "hali ya kuharibika, wakati ambapo ninyi mnakimbilia kila mtu nyumbani kwake. Basi, Kwa ajili yenu, mbingu zimezuiliwa zisitoe umande, " +
                            "nayo nchi imezuiliwa isitoe matunda yake. Nami nitaita wakati wa joto uje juu ya nchi, na juu ya milima, na juu ya nafaka, na juu ya divai " +
                            "mpya, na nuu ya mafuta, na juu ya kila kitu itoacho inchi, na juu ya mwanadamu, na juu ya wanyama, na juu ya kazi zote za mikono.\" " +
                            "Hagai 1:5-11.\n" +
                            "Mara ngapi mambo kama haya huwajia wale ambao si waaminifu katika kurudisha zaka na sadaka zao! ili \"kuzitafakari njia\" zao. Je, hii siyo " +
                            "siri ya ukame mwingi, mapigo ya nzige, na magonjwa yanayotokea katika nchi yetu?\n\n" +
                            "MAFUNDISHO JUU YA FEDHA.\n\n" +
                            "5. Ni mapema kiasi gani katika historia za dunia mwanadamu alianza kawaida ya kurudisha zaka?\n\n" +
                            "\"... Melkizedeki huyo, mfalme wa Salemu, kuhani wa MUNGU aliye juu, ... ambaye Ibrahim alimgawia sehemu ya kumi ya vitu vyote.\" " +
                            "Waebrania 7:1,2. \n" +
                            "Yakobo, mjukuu wa Ibrahim pia naye alirudisha Zaka ya yale yote ya mali aliyopokea kutoka kwa Bwana. (Mwanzo 28:20,22) Mataifa hayo " +
                            "ya zamani waliitambua kila sehemu ya kumi ya mali zao kuwa takatifu kwa MUNGU, vile kamaa walivyoitambua siku ya saba ya juma kuwa " +
                            "takatifu kwa Bwana.\n\n" +
                            "6. Ni sehemu gani kati ya mali zetu MUNGU anadai tumrudishie zaka?\n\n" +
                            "\"Tena ZAKA yote ya nchi, kama ni mbegu ya nchi, au kama ni matunda ya nchi, ni ya Bwana; ni takatifu kwa Bwana... Tena Zaka yote ya " +
                            "ng'ombe au ya kondoo, kila apitaye chini ya fimbo; SEHEMU YA KUMI watakuwa ni takatifu kwa Bwana.\" Mambo ya Walawi 27:30-32.\n" +
                            "Kosa watu wanalolifanya ni kufikiri kwamba wanatakiwa kurudisha zaka tu ya pesa wanazozipokea. Yakobo alipendelea kurudisha zaka ya kila " +
                            "kitu ambacho MUNGU angempa, pia pamoja na \"Chakula na nguo\" (Mwanzo 28:20-22). Mara mtu anapofahamu kwamba hakurudisha zaka ya " +
                            "mapato yake yote na ya pesa alizoziweka benki, ni wajibu wake kurudisha upesi mara aujuapo ukweli huu. Ndipo aendelee kurudisha zaka " +
                            "ya mazidio ya mifugo yake, na mazao ya shambani, na mshahara wake, zawadi ama mengine yote ayapatayo.\n\n" +
                            "7. Je, ikiwa mtu anakudai - naye anakushurutisha umlipe, MUNGU atakusamehe usiporudisha zaka?\n\n" +
                            "\"Mheshimu Bwana kwa mali yako, na kwa malimbuko ya mazao yako yote.\" Mithali 3:9. Hiyo amri ya kwanza kati ya zile kumi yasema, \"Usiwe " +
                            "na minugu mingine ila mimi.\" Kutoka 20:3. Kumnyang'anya MUNGU sehemu yake ili kulipa madeni ya kidunia kwa kweli kabisa ni kuihalifu " +
                            "sheria ile. Hatuna uhuru wa kuzitumia fedha za Bwana kwa kulipia madeni yetu kwani hizo si mali yetu.\n\n" +
                            "8. Awezaje mkulima kuihesabu zaka yake?\n\n" +
                            "Kila mkulima mwenye busara ajua jinsi ya kuihesabu mifugo yake, na mavuno yake. Atapitisha mifugo yake katika lango na kuihesabu, na mfugo " +
                            "wo wote ambao ni wa kumi, hutengwa kando kuwa Zaka. MUNGU asema; \"Hutaangalia kwamba ni mwema au ni mbaya, wala hutambadili...\" " +
                            "Mambo ya Walawi 27:33. Hivyo kadhalika, atayahesabu magunia ya mahindi ama mtama ama madebe ama mabakuli ya nafaka, ambayo ni mavuno " +
                            "toka shambani kwake, pia pamoja na viazi, mboga ama pamba. Pia pamoja na chakula anachokula pamoja na jamaa kama kwa ambavyo angegharamia " +
                            "pesa kama fedha, kama asingelikipata toka shambani kwao. Atayapima hayo maziwa yaliyopatikana kwa ng'ombe zake, na kisha ndipo atachukua " +
                            "sehemu ya kumi ya maziwa yote na kuyauza kwa bei ya mahali hapo, na ndipo atatoa fedha ile kuwa zaka. (Ikiwa mwanafunzi unayo shida " +
                            "kuhusu jinsi ya kurudisha zaka yako, unakaribishwa kuandika barua kwa SAUTI YA UNABII kuhusu swala hilo)\n\n" +
                            "9. Je, zaka ya Bwana itatolewa kwa nani?\n\n" +
                            "MUNGU ameagiza zaka itumiwe kwa kuwahifadhi wahudumu wa Injili watumiao wakati wao wote katika kuifanya kazi ya \"hema ya kukutania.\" " +
                            "Mtume paulo asema hivi: \"Na Bwana vivyo hivyo ameamuru kwamba wale waihubirio Injili wapate riziki kwa hiyo injili.\" 1 Wakorintho 9:14.\n" +
                            "Unatakiwa upeleke zaka yako katika lile kanisa unaloamini kuwa ndilo kanisa la kweli la MUNGU. Ikiwa karibu nawe hakuna kanisa lile " +
                            "unaloamini ya kwamba laifundisha kweli yote ya neno la MUNGU, SAUTI YA UNABII itapokea zaka yako na kukutumia stakabadhi.\n\n"
                    /*"Maswali ya Somo la 12"*/),
            new Lessons("Somo la 13", "Watoto wa MUNGU Wataishi Wakiwa Upande Wake Kikamilifu",
                    "Fungu la kukarirk: \"Ushiriki taabu pamoja nami, kama askari mwema wa KRISTO YESU. Hakuna apiganaye vita ajitiaye " +
                            "katika shughuli za dunia, ili ampendeze yeye aliyemwandika awe askari.\" 2 Timotheo 2:3,4.\n\n" +
                            "UTANGULIZI.\n\n" +
                            "Katika mapigano, KRISTO na watu wake wako katika upande mmoja. Shetani naye na jeshi lake, liko upande wa pili. Ni vita baina ya kweli " +
                            "na uovu, baina ya uzima na mauti. \"Kwa maana kushindana kwetu sisi si juu ya damu na nyama, bali ... ni juu ya wakuu wa giza hili, juu " +
                            "ya majeshi ya pepo wabaya katika ulimwengu wa roho.\" Waefeso 6:12. Kila mmoja ni lazima awe katika upande huu ama mwingine. Hawezi " +
                            "kuwa nusu kwa YESU na nusu kwa Shetani. YESU alisema, \"Mtu asiye pamoja nami yu kinyume changu; na mtu asiye kusanya pamoja nami, hutapanya.\" " +
                            "Mathayo 12:30. Kisha akasema; \"Hakuna mtu awezaye kutumikia mabwana wawili; kwa maana atamchukia huyu, na kumpenda huyu; ama huwa " +
                            "askari wa YESU ama askari wa Shetani. Askari Mkristo atoaye msaada wake nusu kwa MUNGU, AONESHA DHAHIRI kuwa kwa kweli ANAMPENDA YULE " +
                            "ADUI!\n\n" +
                            "JE, MUNGU HUUPOKEA UAMINIFU NUSU-NUSU?\n\n" +
                            "1. MUNGU alitoa jaribio gani kupima uaminifu wa Adamu na Hawa?\n\n" +
                            "MUNGU aliutahini uaminifu wa Adamu na Hawa kwa kuweka katikati ya bustani mti ambao matunda yake aliwakataza wasiyale. Katika jaribio hili, " +
                            "walianguka. Je, MUNGU alijali jambo hili? Je, alisema, \"Aa, nitaliachilia mbali jambo hili na kulisahau. Haidhuru hata ingawa wamekula " +
                            "matunda ya mti ule?\" La! Hakusema hivyo. Aliwaadhibu kwa kutotii kwao. Kwa sababu ya kukosa uaminifu kwa MUNGU, Muumba wao, waliadhibiwa. " +
                            "Na wazawa wao vivyo hivyo ni lazima watazamie kuadhibiwa endapo wataanguka kama vile wazazi wao wa kwanza walivyoanguka.\n\n" +
                            "2. Ni jambo gani lililompata mkewe Lutu kwa kutomtii MUNGU kikamilifu?\n\n" +
                            "Katika kitaub cha Mwanzo 19:1-26 twasoma juu ya uharibifu wa ule mji mwovu wa Sodoma. MUNGU alimtaka Lutu na jamaa yake watoke katika " +
                            "mji huo kabla haujaangamizwa kwa moto. Alituma malaika kuwaonya juu ya jambo hili. Wengine miongoni mwa watoto wake hawakusikiliza onyo " +
                            "hili, wakasababisha iwe vigumu kwa Lutu, mkewe na binti zake wawili kutoka. Hawakupenda kuuacha mji wao, marafiki zao, na jamaa wengine " +
                            "wa nyumba yao. MUNGU alijua ya kwamba ingekuwa vigumu kwao, hivyo, katika kushangaa kwao, MUNGU katika huruma zake, akawatumia malaika " +
                            "kuwashika mikono yao na kuwavuta watoke katika mji huo. Aliwaambia pia wasiangalie nyuma. Alijua kwamba kuangalia kwao nyuma kungesababisha " +
                            "kukimbia kwao kuwe kugumu. Bali mke wa Lutu hakuamini ya kwamba MUNGU anamaanisha kweli kile alichokuwa amewaambia. Aliangalia nyuma kwa sababu " +
                            "alitamani sana kurudi nyuma. Na papo hapo akawa nguzo ya chumvi. Katika kumwonya mwanadamu leo, YESU asema, \"Mkumbukeni mkewe Lutu\" Luka 16:32. " +
                            "MUNGU ni mwangalifu. Atoapo amri ajua sana ya kwamba amri hizo zamfaa mwanadamu kwa kumfurahisha. Amri zake ndizo sheria nzuri zaidi ambazo " +
                            "mwanadamu aweza kuishi kwazo. MUNGU hajali sana lile ambalo mwanadamu anasema atalifanya bali anajali sana lile ambalo mwanadamu alishalifanya. " +
                            "\"Si kila mtu aniambiaye, Bwana Bwana, atakayeingia katika ufalme wa mbinguni bali ni yeye afanyaye mapenzi ya Baba yangu aliye mbinguni.\" " +
                            "Mathayo 7:21. MUNGU ameshakumbana na matata huko mbinguni (Shetani alipopigana na Kristo). Naye hatamchukua mtu ye yote ambaye " +
                            "atasababisha fujo na matata tena huko. Atawachukua rafiki zake tu katika haya makao mazuri ya mbinguni. Je, twawezaje kujua marafiki zake ni " +
                            "nani? YESU alisema, \"Ninyi mmekuwa rafiki zangu, mkitenda niwaamuruyo.\" Yohana 15:14.\n\n" +
                            "YALE AMBAYO MUNGU AYATAZAMIA JUU YA ASKARI WA KIROHO.\n\n" +
                            "3. MUNGU amtazamia askari mkristo kufanya nini?\n\n" +
                            "Kwa kujifunza neno la MUNGU, kama linavyooneshwa katika mpango wa masomo haya, wewe msomaji umejifunza juu ya MUNGU anavyotaka watoto wake wawe, " +
                            "wale askari ambao wanapigana katika jeshi lake. Umejifunza ya kwamba askari huyo\n" +
                            "(a) Atampokea YESU kuwa tumaini lake la pekee la wokovu toka dhambini\n" +
                            "(b) Ataitambua sheria ya Amri kumi kama kanuni ambayo MUNGU amtaka kila mmtoto wake kuifuata.\n" +
                            "(c) Ataishika Sabato kama siku takatifu ya MUNGU, iliyobarikiwa na kutakaswa naye.\n" +
                            "(d) Atabatizwa kama vile YESU alivyobatizwa.\n" +
                            "(e) Atalipenda Neno la MUNGU, naye ataona furaha katika kuzungumza naye katika sala, na katika kumtukuza katika nyimbo.\n" +
                            "(f) Atafurahi katika kumwabudu MUNGU katika jamii pamoja na wengine wa watoto Wake watakatifu. \n" +
                            "(g) Atafurahi katika kueneza habari za injili kwa njia ya Zaka na Sadaka.\n" +
                            "(h) Atauweka mwili wake katika hali ya Afya ifaayo zaidi na siku zote atajifunza kumpendeza MUNGU katika yote afanyayo, hata katika " +
                            "kula kwake na kunywa kwake\n" +
                            "(i) Atawapenda wenzake wa kila kabila na taifa, maadamu pia hao ni wana wa MUNGU, na\n" +
                            "(j) Pia atatafuta kuwa mwaminifu katika maneno na matendo.\n\n" +
                            "4. Ni mambo gani mengine ambayo askari mkristo atakataa kuyafanya?\n\n" +
                            "(a) Hatafikiria juu ya mambo yaliyo machafu. (Wafilipi 4:8)\n" +
                            "(b) Atauweka ubongo wake kuwa safi ili kwamba aweze kujazwa na mawazo ya MUNGU (Wafilipi 4:7).\n" +
                            "(c) Hatasoma vitabu ambavyo vitaujaza ubongo wake na taka taka wala hataziangalia picha ambazo ni mbaya. Mtoto wa MUNGU askari wa MUNGU, " +
                            "hatahudhuria katika majumba ya starehe kama maukumbi ya disco, video, ambamo mapicha ya matendo maovu kama uuaji, wizi, ngono, na matendo " +
                            "yoyote ya ufisadi au za dhambi zo zote zioneshwazo kwa ajili ya macho kuona na kuwa ubongo kujilisha kwa hayo. Hatasikiliza nyimbo chafu na " +
                            "hadithi chafu.\n" +
                            "(d) Mkristo atavaa nguo kufuatia hali ya maongozi ya Neno la MUNGU. MUNGU anachukia kiburi. Shetani alipigana na MUNGU kwa sababu ya " +
                            "kiburi. Ni rahisi sana kwa mtu kujivika vizuri ili kuwafanya watu wengine wamtazame. Yeye pia, aweza kujaribiwa, kwa ajili ya kiburi " +
                            "chake cha ujinga, kupingana na MUNGU, kama vile alivyofanya Shetani. MUNGU asema \"Kuna vitu sita anavyovichukia Bwana, Naam, viko saba " +
                            "vilivyo chukizo kwake. Macho ya KIBURI, ulimi wa UONGO, na mikono IMWAGAYO DAMU isiyo na hatia; moyo UWAZAO MAWAZO MAOVU, shahidi wa " +
                            "UONGO, naye apandaye mbegu ya FITINA kati ya ndugu.\" Mithali 6:16-19. MUNGU AWATAKA watoto wake wajivike kwa hali ya ndani , wajivike " +
                            "kwa upole na moyo wa unyenyekevu. \"Kujipamba kwenu, kusiwe kujipamba kwa nye, yaani kusuka nywele; na kujitia dhahabu, na kuvalia mavazi; " +
                            "bai kuwe utu wa moyoni usioonekana... yaani, roho ya UPOLE NA UTULIVU, ILIYO YA THAMANI KUU MBELE ZA MUNGU.\" 1 Petro 3:3,4. \"Vivyo " +
                            "hivyo wanawake na wajipambe kwa mavazi ya kujisitiri, pamoja na adabu nzuri, kwa moyo wa kiasi, si kwa kusuka nywele. Wala kwa dhahabu na lulu, " +
                            "wala kwa nguo za thamani; bali kwa matendo mema, kama iwapasavyo wanawake wanaoukiri uchaji wa MUNGU.\" 1 Timotheo 2:10.\n" +
                            "(e) Kuna michezo mingine, kama karata, kamari, ambayo MUNGU haipendelei, kwa mfano kucheza kamari (kama karata tatu) huongoza mtu katika " +
                            "dhambi kadha wa kadha. MUNGU hatazamii watoto wake wacheze kamari au bahati nasibu ili kujipatia utajiri. Anawatazamia wafanye kazi kwa " +
                            "mikono na nguvu zao wenyewe. \"Kwa jasho la uso wako utakula chakula chako.\" Mwanzo 3:19.\n" +
                            "Sasa wengine wanadhani ya kwamba maisha ya Kikristo ni usifanye hivi, usifanye hivi, usifanye hivi kila wakati; usifanye hivi na usifanye vile. " +
                            "Wanasahau kabisa ni nini wangemfanyia MUNGU, na ni mambo mangapi MUNGU anawafanyia. Wake kwa waume ambao wanaudharau upendo wa Kristo wa " +
                            "ajabu, hawahitaji gharama yoyote ya kulichukua jina lake, na kuamini katika uwezo wake na upendo; wanaikataa furaha ya kuishi milele pamoja " +
                            "na MUNGU na malaika watakatifu katika amani na furaha daima.\n" +
                            "Mpendwa msomaji, utakubali kusumbuka pamoja na Bwana wako na kujiunga naye katika kuishi maisha ya kushinda - bila kujali dharau na " +
                            "lawama za dunia? MUNGU yu tayari kukusaidia usiliaibishe jina la Mwokozi wako aliyeteswa msalabani kwa ajili yako\n\n"
                    /*"Maswali ya Somo la 13"*/),
            new Lessons ("Somo La 14", "Je, ni Lazima Watoto wa MUNGU wawe Washiriki Kanisani?",
                    "Fungu la Kukariri: \"Kristo naye ni kichwa cha Kanisa\" Waefeso 5:23.\n\n" +
                            "UTANGULIZI.\n\n" +
                            "Neno hili KANISA, maana yake Ni Kundi la watu walioitwa, ama waliojitenga toka mambo ya ulimwengu. \"Kwa kanisa la MUNGU ... wale " +
                            "waliotakaswa katika Kristo.\" 1 Wakorintho 1:2.\n" +
                            "Mara kwa mara swali linaulizwa; \"Kwa nini imenilazimu niwe mshiriki wa kanisa? Je, siwezi kuishi maisha mazuri nikijitenga mwenyewe " +
                            "bila Kanisa? Je, YESU hatanichukua mbinguni ikiwa si mshiriki wa Kanisa?\" Ni kusudi la somo hili kuyajibu maswali haya.\n\n" +
                            "JE, MUNGU ANALITAMBUA KANISA LAKE?\n\n" +
                            "1. Je, twaweza kuwa na hakika ya kwamba MUNGU analo kanisa?\n\n" +
                            "\"Kwa kanisa la MUNGU lililoko Korintho, wale waliotakaswa katika Kristo YESU, walioitwa wawe watakatifu.\" 1 Wakorintho 1:2. \"Upate kujua " +
                            "jinsi iwapasavyo watu kuenenda katika nyumba ya MUNGU, iliyo kanisa la MUNGU aliye hai..\" 1 Timotheo 3:15. \"Msiwakoseshe Wayahudi " +
                            "wala Wayunani wala Kanisa la MUNGU\" 1 Wakorintho 10:32. Hapa twaweza kuwa na hakika ya kwamba katika siku za Mtume Paulo, MUNGU alikuwa nalo " +
                            "kanisa Lake.\n\n" +
                            "2. Je, MUNGU alikuwa na kanisa kabla ya wakati wa Paulo?\n\n" +
                            "Miaka mia nyingi kabla ya Paulo, MUNGU alikuwa analo kanisa. \"Yeye ndiye aliyekuwa katika KANISA jangwani pamoja na yule malaika " +
                            "aliyesema naye katika mlima wa Sinai.\" Matendo 7:38.\n\n" +
                            "3. Je, YESU siku yoyote alisema juu ya kuwa na kanisa?\n\n" +
                            "YESU alimuuliza Petro kama yeye alimfikiria kuwa Yeye ni naani. Petro alijibu \"Wewe ndiwe Kristo, Mwana wa MUNGU aliye hai.\" Kisha " +
                            "YESU alitamka mbaraka juu ya Petro kwa sababu ya imani yake juu ya YESU kuwa Mwana wa MUNGU, na akaongeza maneno haya; \"Juu ya mwamba " +
                            "huu nitalijenga KANISA langu.\" Mathayo 16:18. YESU mara kwa mara katika Biblia alitajwa kama MWAMBA ule ulikuwa ni KRISTO.\" 1 Wakorintho 10:4. " +
                            "YESU alijulikana kama MWAMBA. PETRO maana yake ni JIWE ama KIPANDE CHA JIWE kilichomogeka toka kwa MWAMBA mwenyewe. Ni shukrani gani " +
                            "tungekuwa nayo kujua ya kwamba hilo Kanisa HALIKUJENGWA juu ya Petro, kama wengine waaminivyo, -Petro yule ambaye, kwa udhaifu wake alimkana Bwana, " +
                            "na yule ambaye toka siku ile alipotubia na kuziungama dhambi zake akawa mtenda kazi wa MUNGU, aliyekemewa na Paulo. \"Lakini Kefa (Petro) " +
                            "alipokuja Antiokia, nalishindana naye uso kwa uso, kwa sababu alistahili hukumu.\" Wagalatia 2:11. LA! Kanisa halikujengwa juu ya kiumbe " +
                            "chochote, bali juu ya KRISTO MWENYEWE, \"MWAMBA WA WOKOVU WETU\". Kumbukumbu la Torati 32:15.\n\n" +
                            "KANISA LIKILINGANISHWA NA MWILI\n\n" +
                            "4. Katika Wakolosai 1:18 twasoma hivi: naye ndiye kichwa cha mwili yaani KANISA.\n\n" +
                            "Na sasa kama KANISA lafananishwa na mwili, ni nani aliye KICHWA? Wengine wanaamini ya kwamba mmoja wa wanafunzi wa Kristo ni kichwa cha Kanisa. Je, " +
                            "Neno la MUNGU lasema nini? \"Kristo naye ni KICHWA CHA KANISA; naye ni MWOKOZI  wa mwili.\" Waefeso 5:23. Hatuna mahali pengine po pote " +
                            "katika neno la MUNGU tupatapo kichwa kingine cha KANISA ILA YESU KRISTO mwenyewe.\n\n" +
                            "5. Je, washiriki wa kanisa wanafananishwa na nani?\n\n" +
                            "Washiriki wa nafananiswa na viungo vya mwili. \"Kwa maana mwili si kiungo kimoja, bali ni viungo vingi.\" Fungu la 27 lasema \"Basi " +
                            "ninyi mmekuwa mwili wa Kristo, na viungo kila mmoja peke yake.\" Kila sehemu ya mwili yahitilafiana na sehemu nyingine, bali sehemu zote hufanya kazi pamoja. " +
                            "Viungo vikishindwa kufanya kazi pamoja, mwili huwa mgonjwa. Hawezi kutenda kazi kama kawaida. Mtu akataaye kuwa kiungo ama sehemu ya " +
                            "mwili ule si kwamba analidhoofisha Kanisa tu, bali hata yeye mwenyewe ANAPOTEZA NGUVU ZAKE za kuishi maisha ya kiroho. \"Na jicho haliwezi " +
                            "kuiambia miguu \'sina haja nanyi\'. Bali zaidi sana vile viungo vya mwili vidhaniwavyo kuwa vinyonge zaidi vyahitajiwa zaidi.\" " +
                            "1 Wakorintho 12:21,22.\n\n" +
                            "JINSI YA KUWA MSHIRIKI WA KANISA\n\n" +
                            "6. Ni mambo gani ambayo ni lazima kwa mtu ili awe mshiriki wa kanisa la MUNGU?\n\n" +
                            "Rudia Somo la 7. YESU alisema hivi kabla ya kupaa kwa Baba yake. \"Basi, enendeni mkawafanye mataifa yote kuwa wanafunzi, mkiwabatiza " +
                            "kwa jina la Baba, na Mwana, na Roho Mtakatifu; na kuwafundisha kuyashika yote niliyowaamuru ninyi; na tazama, mimi nipo pamoja nanyi " +
                            "siku zote hata ukamilifu wa dahari.\" Mathayo 28:18-20. Toka fungu hili twajifunza ya kwamba kabla mtu hajawa tayari, Afunzwe kuyashika " +
                            "yote YESU aliyoamuru. Bila kutanguliza haki yake yo yote. Abatizwe kwa Jina la Baba, na la Mwana na la Roho Mtakatifu.\n\n" +
                            "7. Je, mtoto mchanga abatizwe?\n\n" +
                            "La! Mtoto mchanga hawezi kufunzwa, hawezi kuamini, hawezi kutubu, wala hawezi kuungama. Je, wawezaje watoto wachanga kuwa tayari kwa " +
                            "ubatizo? Hakuna mzazi awaye yote awezaye kumwokoa mtoto wake kwa kumtoa abatizwe. Soma Ezekieli 14:20. Hakuna ushahidi wo wote katika Neno " +
                            "la MUNGU wa mtoto mchanga kubatizwa. Ni baada ya miaka mingi, baada ya YESU kupaa mbinguni ndipo jambo hili la kubatizwa watoto wachanga " +
                            "likaingizwa katika kanisa. Ikiwa mtoto wa mzazi ataokolewa pamoja na mzazi wake katika ufalme wa MUNGU.\n\n" +
                            "MAANA YA UBATIZO\n\n" +
                            "8. Ubatizo ni dalili ya nini?\n\n" +
                            "\"Hamfahamu ya kuwa sisi sote tuliobatizwa katika Kristo YESU tulibatizwa katika mauti Yake? Basi tulizikwa pamoja naye kwa njia ya ubatizo " +
                            "katika mauti yake, kusudi kama Kristo alivyofufuka katika wafu kwa njia ya utukufu wa baba, vivyo hivyo na sisi tuenende katika upya " +
                            "wa uzima.\" Warumi 6:3,4. Ubatizo ni UKUMBUSHO WA KUFA NA KUFUFUKA KWA YESU.\n\n" +
                            "9. Kuna aina ngapi za ubatizo zitajwazo katika Biblia?\n\n" +
                            "\"Bwana mmoja, imani moja, UBATIZO mmoja.\" Waefeso 4:5.\n\n" +
                            "NAMNA YA UBATIZO.\n\n" +
                            "10. Je, Biblia yasema mtu angebatizwa namna gani?\n\n" +
                            "YESU ni mfano wetu katika mambo yote. Je, YESU alibatizwaje? \"Naye YESU alipokwisha kubatizwa mara akapanda kutoka majini.\" Mathayo 3:16. " +
                            "Inasemekana juu ya huyu aliyembatiza YESU (Yohana Mbatizaji), ya kwamba alibatiza \"huko Ainoni, karibu na Salimu, kwa sababu huko kulikuwa na maji tele.\" " +
                            "Yohana 3:23. Kufanya ukumbusho wa kifo na ufufuo wa YESU ni lazima kufa, kuzikwa na kufufuka tena. Wakristo wa kwanza walikuwa wakizikwa siku " +
                            "zote kwa ajili ya ubatizo. Filipo alimbatiza yule towashi mhabeshi inasemekana: \"Wakatelemka wote wawili majini, Filipo na yule " +
                            "towashi; naye akambatiza; Kisha, walipopanda kutoka majini, Roho wa Bwana akamnyakua Filipo. Matendo 8:38,39. \n" +
                            "Baada ya YESU kuondoka katika ulimwengu huu, na baada ya miaka mingi, ndipo ubatizo wa kunyunyizwa maji ukaletwa kanisani, ambao, " +
                            "kwa njia iwayo yote hauoneshi kufa. Ikiwa mtu hakuwa akielewa maana ya ubatizo, angebatizwa tena. YESU alipotoka majini, Baba yake " +
                            "alisema, \"Huyu ni mwanangu mpendwa wangu, ninayependezwa Naye.\" Mathayo 3:17. MUNGU vivyo hivyo atapendezwa nawe ikiwa utabatizwa vile " +
                            "vile kama YESU alivyobatizwa. Matendo 22:16. \"Basi, sasa unakawilia nini? Simama, ubatizwe, ukaoshe dhambi zako, ukiliitia Jina Lake.\n\n"
                    /*"Maswali ya Somo la 14"*/),
            new Lessons("Somo la 15", "Kanuni ya MUNGU ya Uaminifu kwa Watoto Wake.",
                    "Fungu la Kukariri: \"Akamwambia, mpende Bwana , MUNGU wako kwa moyo wako wote, na kwa roho yako yote, na kwa akili zako zote. " +
                            "Hii ndiyo amri iliyo kuu, tena ni ya kwanza. Na ya pili yafanana nayo, nayo ni hii, Mpende jirani yako kama nafsi yako.\" Mathayo 22: 37,39.\n\n" +
                            "UTANGULIZI.\n\n" +
                            "Amri nne za kwanza ya zile Kumi zaonesha upendo wetu kwa MUNGU, na zile sita za Mwisho zaonesha upendo wetu kwa mwanadamu. \"Katika amri hizi " +
                            "mbili hutegemea torati yote ...\" Mathayo 22:40.\n\n" +
                            "MPENDE JIRANI YAKO.\n\n" +
                            "1. Mtu anatakiwa ampende jirani yake kwa kiasi gani?\n\n" +
                            "Mtu angempenda jirani yake kama ajipendavyo yeye mwenyewe. Mathayo 22:39. \"Mpende jirani yako kama nafsi yako.\"\n\n" +
                            "2. Jirani ya mtu ni nani?\n\n" +
                            "Je, jirani yetu ni yule anayeishi karibu na nyumba yetu? YESU asema nini? Luka 10:29-37. \"Naye akitaka kujidai haki, alimuuliza YESU. Na " +
                            "jirani yangu ni nani? YESU akajibu, akasema, Mtu mmoja alishuka toka Yerusalemu kwenda Yeriko, akaangukia kati ya wanyang'anyi; wakamvua nguo, " +
                            "wakamtia jeraha, wakaenda zao, wakimwacha karibu ya kufa. Kwa nasibu, kuhani mmoja alishuka kwa njia ile; na alipomwona alipita kando. " +
                            "Na Mlawi vivyo hivyo, alipofika pale akamwona, akapita kando, lakini, Msamaria mmoja katika kusafiri kwake alipofika hapo, na alipomwona, " +
                            "alimhurumia, akakaribia, akamfuta jeraha zake, akizitia mafuta na divai; akampandisha juu ya mnyama wake, akampeleka mpaka nyumba ya " +
                            "wageni, akisema, Mtunze mtu huyu, na chochote atakachogharimiwa zaidi, mimi nitakaporudi nitakulipa. Waonaje wewe, katika hao watatu, ni yupi " +
                            "aliyekuwa jirani yake yule aliyeangukia kati ya wanyang'anyi? Akasema, Ni huyo aliemwonea huruma. YESU akamwambia, Enenda zako, nawe " +
                            "ukafanye vivyo hivyo.\"\n" +
                            "Ni nani basi anayepaswa nimpende kama vile nijipendavyo nafsi yangu? Jirani si jamaa ya mtu tu, ama rafiki yake, ama yule mtu aishiye karibu " +
                            "na nyumba yake, la, ni mtu awaye yote ahitajiye msaada wake. Kila mmoja wa watoto wa MUNGU Ni jirani.\n\n" +
                            "3. Twaweza kumfanyia nini jirani yetu (kila mmoja wa mwana wa MUNGU) mbali na ya kwamba yuko katika shida?\n\n" +
                            "Kwa vile ambavyo sita ya hizo Amri Kumi zatufunza jinsi ya kumpenda jirani yetu, hebu na tuziangalie ile tupate jawabu la swali hili\n\n" +
                            "(a) Umheshimu Baba yako na Mama yako. Kutoka 20:12\n\n" +
                            "Kuwaheshimu wazazi kunakuja mbele ya yale mengine yote. Mtoto anayekua katika nyumba ya Kikristo, kuwaheshimu wazazi wake, ni dhahiri " +
                            "ya kwamba ataiheshimu Serikali na MUNGU atakapokuwa mkubwa.\n\n" +
                            "(b) Usiue. Kutoka 20:13.\n\n" +
                            "Kwa vile ambavyo YESU alimpenda kila mmoja hata kumfia, kila mmoja ni wa thamani mbele zake. Awezaje mtu kumpenda MUNGU na huku anawachukia " +
                            "watoto wake wengine? 1 Yohana 3:15. \"Kila amchukiaye ndugu yake ni muuaji\". Kwa hivyo, amri hii ya sita hailengi tu kuutoa uhai wa mtu mwingine " +
                            "(kuua), bali pia na kujiua mwenyewe. Kinyume cha hayo, YESU asema nini? \"Wapendeni adui zenu, waombeeni wanaowaudhi.\" Mathayo 5:44. " +
                            "Kweli, twaweza kuuchukia ule uovu ambao mtu aufanya, bali imetubidi kutomchukia kabisa mtu huyo. Imetulazimu kumpenda. Yawezaje kufanyika haya? " +
                            "Kwa Kristo pekee tu. \"Nayaweza mambo yote katika yeye anitiaye nguvu.\" Wafilipi 4:13. Sasa, mwingine aweza kuuliza; \"Je, Serikali inayo haki " +
                            "ya kuua?\" Je, MUNGU asema nini? Mwanzo 9:6. \"Atakayemwaga damu ya mwanadamu, damu yake huyo itamwagwa na mwanadamu; maana kwa mfano Wake " +
                            "MUNGU alimfanya mwanadamu.\"\n\n" +
                            "(c) Usizini. Kutoka 20:14.\n\n" +
                            "MUNGU alipomuumba mwanadamu, alimfanyia mke awe msaidizi wake. (Mwanzo 2:18) Katika fungu la 24 la sura iyo hiyo, twasoma hivi: \"Kwa " +
                            "hiyo mwanamume atamwacha baba yake na mama yake na ataambatana na mkewe, nao watakuwa mwili mmoja.\" Ndoa ni ushirika wa mji vilivyoamriwa na " +
                            "MUNGU hivyo ni unganiko takatifu. YESU aliadhiisha hiyo sheria kwa kusema, \"Mmesikia kwamba imenenwa, Usizini, lakini mimi nawaambieni, " +
                            "kila mtu amtazamaye mwanamke kwa kumtamani, amekwisha kuzini naye moyoni mwake.\" Mathayo 6:32. \"Mtu aziniye na mwanamke hana akili kabisa; " +
                            "afanya jambo litakalomwangamiza nafsi yake\"\n\n" +
                            "(d) Usiibe. Kutoka 20:15.\n\n" +
                            "Mathayo 7:12. \"Basi yo yote mtakayo mtendewe na watu, nanyi watendeeni vivyo hivyo; maana hiyo ndiyo torati na manabii.\" " +
                            "Je, Ungependa mtu akuibie? La! Hungependa. Basi, imekubidi nawe usimwibie, kama fungu hili linavyosema; si nyumba tu, bali hata nchi " +
                            "yake, ama ng'ombe ama mke. \"Mwibaji asiibe tena; bali afadhali afanye juhudi, akitenda kazi iliyo nzuri kwa mikono yake mwenyewe, apate " +
                            "kuwa na kitu cha kumgawia mhitaji.\" Je, mtu angefanya nini kama ameiba? Ezekiel 33:15 \"Kama mtu mwovu akirudisha rehani, na kumrudishia " +
                            "mtu mali yake aliyomdanganya, akazifuata sheria za uzima asitende uovu wowote; hakika ataishi, hatakufa.\"\n\n" +
                            "(e) Usimshuhudie jirani yako uongo. Kutoka 20:16.\n\n" +
                            "Mtu atoapo ushahidi wa uongo, ni kusema, asema ambavyo si kweli juu ya mwingine. \"Midomo ya uongo ni chukizo kwa Bwana.\" Mithali 12:22, " +
                            "waongo wataangamizwa, hawatayaona kamwe yale makao ambayo YESU ayaandaa kwa watoto wake. Ufunuo 21:8. \"Bali waoga, na wasioamini, na " +
                            "wachukizao, na wauaji, na wazinzi, na wachawi, na hao waabuduo sanamu, na WAONGO WOTE, sehemu yao ni katika ziwa liwakalo moto na " +
                            "kiberiti; hii ndiyo mauti ya pili.\"\n\n" +
                            "(f) Usiitamani nyumba ya jirani yako, usimtamani mke wa jirani yako; wala mtumwa wake, wala mjakazi wake, wala ng'ombe wake, wala punda " +
                            "wake wala chochote alicho nacho jirani yako.\" Kutoka 20:17.\n\n" +
                            "Kwa nini ni dhambi kutamani vitu ambavyo ni vya wengine? Kwa maana tamaa ile inaweza kuongezeka na mwishowe ikawa ni kuiba vitu vile " +
                            "ulivyovitamani. \"Lakini uasherati usitajwe kwenu kamwe wala uchafu wo wote wala kutamani.\" Waefeso 5:3. \"Msiwe na tabia ya kupenda fedha; " +
                            "mwe radhi na vitu mlivyo navyo; kwa kuwa yeye mwenyewe amesema Sitakupungukia kabisa.\" Waebrania 13:5. \"Halafu ile tamaa ikiisha " +
                            "kuchukua mimba, huzaa dhambi, na ile dhambi ikisha kukomaa, huzaa mauti.\" Yakobo 1:15. Katika fungu hili la mwisho twaweza kuona kwamba, " +
                            "mmoja anaporuhusu kutamani vitu vile ambavyo ni mali ya mtu mwingine, matokeo yake ni dhambi, na matokeo ya dhambi ni mauti. Kutamani ni " +
                            "hatari!\n\n" +
                            "MPENDE BWANA MUNGU WAKO\n\n" +
                            "4. Twaoneshaje Upendo Wetu Kwa MUNGU?\n\n" +
                            "\"Mpendane kama nilivyowapenda ninyi.\" Yohana 15:12. Twauonesha upendo wetu kwa MUNGU, si kwa kumheshimu Yeye tu bali na kwa kuwapenda " +
                            "watoto Wake. Njia nyingi zimetajwa ambazo kwazo twaweza kuuonesha upendo wetu kwa watoto wa MUNGU, bali njia moja bado haijatajwa. Kama " +
                            "ungalimwona mtu akienda na maji, ama kuteketea na moto ama kunywa sumu, ungefanya nini? Ungefanya kadiri unavyoweza kumwokoa mtu yule. " +
                            "Je, huo usingekuwa wajibu wako? Laiti ungekuwa katika hatari hiyo mwenyewe, kamwe, je, usingekuwa wajibu wa mtu mwingine kujaribu " +
                            "kukuokoa? Ndiyo, Watoto wengi wa MUNGU wako katika hatari ya kuupoteza uzima wa milele mtu mwingine asipowaambia juu ya Baba yao, MUNGU, na " +
                            "juu ya YESU KRISTO Mwokozi wao, pia na hizo amri zioneshazo kusudi la MUNGU kwao. Wawezaje kuambiwa? Warumi 10:13-15. \"Kwa kuwa, kila " +
                            "atakayelitaja jina la Bwana ataokoka. Basi wamwiteje Yeye wasiyemwamini? Tena wamwaminije yeye wasiyemsikia? Tena wamsikiaje pasipo " +
                            "mhubiri? Tena wahubirije wasipopelekwa? ...\" Mhubiri aliyetumwa kwenda kuzitangaza habari za wokovu kwa wanadamu hana wakati wa kufanya " +
                            "kazi nyingine ili kupokea mshahara kwa mahitaji yake. Watu wengine inawabidi wamtolee yeye mahitaji yake. 1 Wakorintho 9:13,14 \"Hamjui " +
                            "ya kuwa wale wazifanyao kazi za hekaluni hula katika vitu vya hekalu... Na Bwana vivyo hivyo ameamuru kwamba wale waihubirio Injili " +
                            "wapate riziki kwa hiyo Injili.\" Basi ikiwa ni ya kwamba wale waihubirio Injili wamepaswa kuruzukiwa, vile kama wale Walawi waliolitunza hekalu " +
                            "la MUNGU kule Yerusalemi, imetulazimu tutafute huo ulikuwa mpango gani.\n" +
                            "Mpango wa MUNGU kwa Walawi ulikuwa hivi - Walipewa ZAKA (sehemu moja ya kumi) kuwa urithi wao. Soma Hesabu 18:20-24. Hivyo wahubiri " +
                            "imewapasa nao kutunzwa kama Walawi. Wangeipokea zaka ya watoto wa MUNGU kuwa riziki yao.\n\n"
                    /*"Maswali ya Somo la 15."*/),
            new Lessons("Somo la 16", "Mambo Kumi Yanayolete Uhuru Kamili",
                    "Fungu la kukariri: \"Mkinipenda, mtazishika amri zangu.\" Yohana 14:15.\n\n" +
                            "UTANGULIZI.\n\n" +
                            "Mahari pengine duniani wanazungumza habari za uhuru. Uhuru wa kweli kamwe hautoki kwenye machafuko makali na fujo, mahali ambapo " +
                            "kila mtu hufanya apendavyo na kuasi sheria za haki za nchi. Kwa mfano, ikiwa kila mmoja ataendesha gari au pikipiki upande wowote wa " +
                            "barabara apendavyo, huo hautakuwa uhuru; bali yatakuwa machafuko na husababisha ajali. Uhuru wa kweli huja katika utiifu wa sheria za " +
                            "haki. YESU alisema: \"Mtaifahamu kweli, nayo hiyo kweli itawaweka huru.\" Yohana 8:32. Daudi alisema; \"Nami nitakwenda panapo nafasi, kwani " +
                            "nimejifunza mausia yako.\" Zaburi 119:45. Uasi wa Sheria za MUNGU huleta utumwa tu. UTUMWA HUU wa roho ni dhambi.\n\n" +
                            "KANUNI YA KUISHI YA YESU\n\n" +
                            "1. YESU aliishi kwa kanuni gani?\n\n" +
                            "YESU apenda tukae ndani yake ili tusifanye dhambi, bali tuenende kama vile yeye alivyoenenda, kufanya hayo aliyoyafanya. Hii ndiyo maana " +
                            "yake kuwa Mkristo. Kuendenda kama Kristo alivyoenenda, kutenda kama alivyotenda. Sasa swali letu ni hili: \"Je, YESU alienenda namna gani? " +
                            "Ni kwa kadiri ya kanuni gani aliishi? Ni kwa sheria gani aliyapima maisha Yake?\" Katika Yohana 15:10 asema \"Kama mimi nilivyozishika " +
                            "amri za Baba yangu.\" Basi haitupasi haitupasi tuziangalie amri za MUNGU ili tujue vile tungalienenda? Mhubiri 12:13 \"Mche MUNGU, " +
                            "nawe uzishike amri zake. Maana kwa jumla ndiyo impasayo mtu.\" Ni wajibu wetu kuenenda kama Kristo alivyoenenda kuzishika amri alizo" +
                            "zishika.\n\n" +
                            "MAMBO KUMI YA MUNGU YALETAYO UHURU KAMILI.\n\n" +
                            "2. Mwanadamu alipewa amri za MUNGU?\n\n" +
                            "MUNGU alikuwa amamewaweka huru watu wake wa Israeli toka utumwani huko Misri. Alikuwa akiwaongoza kwenye nvhi aliyokuwa amemwahidia. " +
                            "Walikuwa wamekuwa watumwa kwa siku nyingi hata walikuwa wamesahahu yale ambayo MUNGU alikuwa amewafunza baba zao kuyatenda kwa kuwatayarisha " +
                            "ili waishi tena kama alivyopenda, aliwapa amri.\n\n" +
                            "3. Amri hizi twazipata wapi katika Biblia?\n\n" +
                            "Jumla ya amri hizi ni kumi, nazo zimeandikwa katika Kutoka 20:3-17.\n" +
                            "1.\"MUNGU akanena maneno haya yote akasema, Mimi ni Bwana MUNGU wako, niliyekutoa katika nchi ya Misri, katika nyumba ya utumwa. " +
                            "USIWE NA MIUNGU MINGINE ILA MIMI.\n" +
                            "2. Usijifanyie sanamu ya kuchonga, wala mfano wa kitu chochote kilicho juu mbinguni, wala kilicho chini duniani, wala kilicho majini " +
                            "chini ya dunia. Usivisujudie wala kuvitumikia; kwa kuwa mimi, Bwana MUNGU wako, ni MUNGU mwenye wivu; nawapatiliza wana maovu ya baba zao, " +
                            "hata kizazi cha tatu na cha nne cha wanichukiao, nami nawarehemu maelfu wanipendao, na kuzishika amri zangu.\n" +
                            "3. Usilitaje bure jina la Bwana, MUNGU wako, maana Bwana hatamhesabia kuwa hana hatia mtu alitajaye jina lake bure.\n" +
                            "4. Ikumbuke siku ya Sabato uitakase. Siku sita fanya kazi, utende mambo yako yote; lakini siku ya saba ni Sabato ya Bwana, MUNGU wako, " +
                            "siku hiyo usifanye kazi yo yote, wewe, wala mwana wako, wala binti yako, wala mtumwa wako, wala mjakazi wako, wala mnyama wako wa " +
                            "kufuga wala mgeni aliye ndani ya malango yako. Maana, kwa siku sita Bwana alifanya mbingu, na nchi, na bahari, na vyote vilivyomo, " +
                            "akastarehe siku ya saba; hivyo Bwana akaibarikia siku ya Sabato akaitakasa.\n" +
                            "5. Waheshimu baba yako na mama yako; siku zako zipate kuwa nyingi katika nchi upewayo na Bwana, MUNGU wako.\n" +
                            "6. Usiue\n" +
                            "7. Usizini\n" +
                            "8. Usiibe\n" +
                            "9. Usimshuhudie jirani yako uongo.\n" +
                            "10. Usiitamani nyumba ya jirani yako. Usimtamani mke wa jirani yako; wala mtumwa wake, wala mjakazi wake, wala ng" +
                            "'ombe wake, wala punda wake, wala cho chote alichonacho jirani yako.\"\n" +
                            "Siku moja YESU aliulizwa. \"Katika torati, amri ipi iliyo kuu?\" Akajibu, \"Mpende Bwana MUNGU wako kwa moyo wako wote ... hii ndiyo " +
                            "amri iliyo kuu, tena ni ya kwanza. Na ya pili yafanana nayo, nayo ni Mpende jirani yako kama nafsi yako.\" Kisha akaongeza, \"Katika amri hizi " +
                            "mbili hutegemea torati yote na manabii\". Kweli, ni \"UPENDO KWA MUNGU\" na \"UPENDO KWA MWANADAMU\" ndicho kiini cha amri zote. " +
                            "Kwani, kwa kuzishika zile amri nne za kwanza twauonesha upendo wetu kwa MUNGU; na kwa kuzishika zile amri sita zibakizo twauonesha upendo " +
                            "wetu kwa mwanadamu.\n\n" +
                            "SHERIA YA MUNGU YA MILELE.\n\n" +
                            "4. Sheria za MUNGU zitadumu kwa muda gani?\n\n" +
                            "YESU alipokuwa hapa duniani aliyasema hayo maneno yapatikanayo katika Mathayo 5:17-18. \"Msidhani ya kuwa nalikuja kutangua torati au " +
                            "manabii; la, sikuja kutangua, bali kutimiliza. Kwa maana, amin nawaambieni, Mpaka mbingu na nchi zitakapoondoka, yodi moja wala nukta moja " +
                            "ya torati haitaondoka, hata yote yatimie.\"\n" +
                            "Yodi ama nukta ni sehemu ndogo sana ya herufi, kama vile kadoti juu ya herufi \"i\", ama kimsitari kidogo kinachoikata herufi \"t\". " +
                            "YESU alisema hata sehemu ndogo kama hiyo haingepita.\n" +
                            "Zaburi 111:7,9. \"Matendo ya mikono Yako ni kweli na hukumu. Maagizo Yake yote ni amini, Yamethibitika milele na milele. Yamefanywa katika kweli " +
                            "na adili.\" Luka 16:17 \"Lakini ni nyepesi zaidi mbingu na nchi vitoweke, kuliko itanguke nukta moja ya torati.\" Kama MUNGU alivyo wa " +
                            "milele (Kumbukumbu la Torati 33:27) vivyo na Sheria Yake ni ya milele. Haiwezi kupita.\n\n" +
                            "DHAMBI IKIDHIHIRISHWA NA SHERIA.\n\n" +
                            "5. Mambo gani mawili yaliyodhihirishwa ndani ya sheria?\n\n" +
                            "Sheria hudhihirisha mambo gani mawili: (a) Mapenzi ya MUNGU kwa watoto wake na (b) dhambi. Zaburi 4:8 \"Kufanya mapenzi yako, Ee MUNGU wangu, " +
                            "ndiyo furaha yangu; Naam, sheria yako imo moyoni mwangu.\" Warumi 3:20 \"Kutambua dhambi huja kwa njia ya sheria\". Yakobo 1:22-25 \"" +
                            "Lakini iweni watendaji wa neno, wala si wasikiaji wa neno tu hali mkijidanganya nafsi zenu. Kwa kuwa mtu akiwa ni msikiaji wa neno tu, " +
                            "wala si mtendaji, mtu huyo ni kama mtu anayejiangalia uso wake katika kioo. Maana hujiangalia, kisha huenda zake, mara akasahau jinsi " +
                            "alivyo. Lakini aliyeitanzama SHERIA KAMILIFU ILIYO YA UHURU, na kukaa humo, asiwe msikiaji msahaulifu, bali mtendaji wa kazi huyo atakuwa " +
                            "heri katika kutenda kwake.\" Zaburi 119:1 \"Moyoni mwangu nimeliweka neno lako, nisije nikakutenda dhambi.\" Basi ndilo kusudi la sheria - " +
                            "kulidhihirisha pendo la MUNGU kwa watoto wake, ili wapate kujua dhambi ni nini, ili wasimtendee dhambi.\n\n" +
                            "DHAMBI NI UASI WA SHERIA ZA MUNGU.\n\n" +
                            "6. Ni sehemu gani ya sheria mtu angeliitii?\n\n" +
                            "Toka 1 Yohana 3:4 twajifunza ya kwamba \"dhambi ni uasi\" Je! ni dhambi ipi hasa ambayo tukiifanya ndipo tutakuwa tumeiacha sheria ya " +
                            "MUNGU? Watu hawapatani katika jambo hili. Je, MUNGU asema nini? Yakobo 2:10 anasema: \"Maana mtu awaye yote atakayeishika sheria yote, " +
                            "ila akajikwaa katika neno moja, amekosa juu ya yote.\n\n" +
                            "MUNGU ASIFIWE! UTUMWA UMEONDOLEWA MILELE.\n\n" +
                            "7. Je, Sheria ya MUNGU yaweza kubadilika?\n\n" +
                            "La! Haiwezi kubadilika. Mwanadamu aweza kuzibadili sheria anazozitunga kama ambavyo mwanadamu alivyo kigeugeu, bali MUNGU habadiliki. " +
                            "Malaki 3:6. \"Kwa kuwa Mimi ni Bwana, sina kigeugeu.\" Zaburi 89:34. \"Mimi sitalihalifu agano langu, Sitalibadili neno lililotoka " +
                            "midomoni mwangu.\" Zaburi 11:78. \"Maagizo Yake yote ni amini, yamethibitika milele na milele.\" MUNGU anahukumu watu wake kwa sheria " +
                            "zake. Mhubiri 12:13,14. \"Mche MUNGU, nawe uzishike amri zake, Maana kwa jumla ndiyo impasayo mtu. Kwa maana MUNGU ataleta hukumuni kila " +
                            "kazi, pamoja na kila neno la siri, likiwa jema au likiwa baya.\" Tendo la MUNGU Baba la kumtoa Mwanawe asumbuke na kusifia dhambi zetu, ni " +
                            "hakikisho la kwamba amri za MUNGU hazibadiliki, nazo zasimama milele. Je, msomaji, kwa nini usioneshe upendo wako kwa MUNGU kwa " +
                            "kuzitii amri zake sasa? \"Mkinipenda, mtazishika amri zangu.\" Yohana 14:15.\n\n"
                    /*"Maswali ya Somo la 16"*/),
            new Lessons("Somo la 17", "Amri Ambayo Wengi wa Watoto wa MUNGU Hawaishiki",
                    "Fungu la Kukariri: \"Ikumbuke siku ya SABATO uitakase, siku sita fanya kazi, utende mambo yako yote; lakini siku ya SABA ni SABATO ya " +
                            "BWANA, MUNGU wako, siku hiyo usifanye kazi yo yote, wewe wala mwana wako, wala binti yako, wala mtumwa wako, wala mjakazi wako, " +
                            "wala mnyama wako wa kufuga, wala mgeni aliye ndani ya malango yako. Maana kwa siku sita Bwana alifanya mbingu, na nchi, na bahari, na " +
                            "vyote vilivyomo, akastarehe siku ya SABA: Kwa hiyo Bwana AKAIBARIKIA siku ya SABATO AKAITAKASA.\" Kutoka 20:8-11.\n\n" +
                            "UTANGULIZI\n\n" +
                            "Je! tuonapo ya kwamba tumevunja amri yo yote ya MUNGU, tungefanya nini? Je! tungeendelea kuivunja? Je! Mwenye duka angefanya nini baada " +
                            "ya kuona kwamba mizani yake inapima vitu pungufu? Je! Angeendelea kuitumia hivyo bila kuitengeneza? Bila shaka ungesema huyo ni mdanganyifu " +
                            "kwa wanunuzi wake, na ya kwamba si mwaminifu! Je! Tungekuwa wadanganyifu kwa MUNGU? Hatuwezi kuenenda kama vile YESU alivyoenenda hata " +
                            "kidogo ikiwa hatutazishika kila moja ya amri ambazo Kristo alizishika.\n\n" +
                            "SABATO KATIKA SIKU ZA AGANO LA KALE\n\n" +
                            "1. Ni siku ipi ambayo MUNGU aliibariki iwe SABATO yake?\n\n" +
                            "\"Na siku ya SABA MUNGU alimaliza kazi yake yote aliyoifany, AKASTAREHE SIKU YA SABA, AKAITAKASA, kwa sababu katika siku hiyo MUNGU ALISTAREHE " +
                            "akaacha kufanya kazi yake yote aliyoiumba na kuifanya.\" Mwanzo 2:2,3. Ijumaa jioni (Utakumbuka ya kwamba katika mipango ya MUNGU, jioni " +
                            "huja kwanza, na sehemu ya nuru hufuata. Soma Mwanzo 1:5 \"Ikawa jioni, ikawa asubuhi\", kazi ya uumbaji ya MUNGU ilipomalizika, ALIPUMZIKA. " +
                            "Alitenga siku ya SABA kama siku ya ukumbusho wa uumbaji siku ya kuzaliwa kwa dunia yetu.\n\n" +
                            "2. Je, Adamu na Hawa walijua ya kwamba MUNGU aliwataka waishike SABATO yake?\n\n" +
                            "Ndiyo, walijua, kwa sababu amri za MUNGU zilikuwepo na walikuwa nazo hata ingawa zilikuwa bado kutolewa na MUNGU katika mlima Sinai. Soma " +
                            "Warumi 5:12-14.\n\n" +
                            "3. Je, Wana wa Israeli waliishika SABATO kabla ya kutolewa kwa sheria ya MUNGU mlimani pa Sinai?\n\n" +
                            "Ndiyo, Ibrahimu aliitunza SABATO ya siku ya SABA, kwani twasoma katika Mwanzo 26:5 \"Kwa sababu Ibrahimu alisikia sauti yangu, akayahifadhi " +
                            "maagizo yangu, na hukumu zangu na sheria zangu.\"\n\n" +
                            "5. Je, SABATO ilikuwa ikiadhimishwa katikati ya wakati wa kutolewa mlimani Sinai na siku za YESU?\n\n" +
                            "Ndiyo, Soma mafungu yafuatayo kwa uangalifu?\n" +
                            "\t(a) Sabato ilishikwa mnamo siku za Nehemia. Soma Nehemia 13:17-19.\n" +
                            "\t(b) Sabato ilishikwa siku za Isaya. Soma Isaya 58:13,14\n" +
                            "\t(c) Sabato ilishikwa mnamo siku za Yeremia. Soma Yeremia 17:21-27.\n" +
                            "\t(d) Sabato ilishikwa mnamo siku za Ezekieli. Soma Ezekieli 20:12,19\n" +
                            "\t(e) Sabato ilishikwa mnamo siku za Amosi. Soma Amosi 8:4,5.\n" +
                            "Alipozitoa hizo amri mlimani pale Sinai, alipokuwa akitoa amri ya Sabato, alianza na neno hili: \"IKUMBUKE\". Je, neno hilihalituoneshi " +
                            "ya kwamba watu walikuwa wameishaanza kuisahau na huenda wangeendelea kuisahau tena? Laiti watu wote wangeliikumbuka Sabato, kuzikumbuka " +
                            "kazi za MUNGU za ajabu, kama lilivyokuwa kusudi Lake, kusingalikuwa na watu wasioamini. Katika Isaya 56:1-7 twasoma juu ya mibaraka ya " +
                            "wale wageni (watu ambao si Wayahudi) watakaojiunga na MUNGU. Sabato haikufanyiwa Wayahudi peke yao. Kama Sabato ilifanywa kwa Wayahudi peke " +
                            "yao, basi kama ni hivyo, mtu ye yote asiyekuwa Myahudi angeweza kuiba, na kuua, ama kutenda lo lote kinyume cha zile amri kumi na isiwe " +
                            "kosa kwake. Amri hizi kumi ni \"KWA MATAIFA YOTE\"\n\n" +
                            "SABATO KATIKA SIKU ZA AGANO JIPYA.\n\n" +
                            "6. Je, ni siku ipi YESU aliishika kama Sabato?\n\n" +
                            "Marko 2:27,28 \"Akawaambia, Sabato ilifanyika kwa ajili ya mwanadamu, si mwanadamu kwa ajili ya SABATO. Basi Mwana wa Adamu ndiye Bwana " +
                            "wa Sabato pia.\" Je, YESU alisema Sabato ilifanywa kwa ajili ya Myahudi? La! \"Kwa ajili ya mwanadamu, si mwanadamu kwa ajili ya Sabato.\" " +
                            "Ilikuwa siku yake takatifu aliyoifanya na ilikuwa vivyo siku yake takatifu alipokuwa duniani. Waebrania 13:8 \"YESU Kristo ni yeye yule, " +
                            "jana na leo na hata milele\"\n" +
                            "Katika Ufunuo 1:10 Yohana asema \"Nalikuwa katika Roho, siku ya Bwana\". Ambayo kwa hakika ilikuwa siku ya SABA kwa vile hakuna siku " +
                            "nyingine iitwayo hivyo katika neno la MUNGU.\n" +
                            "Luka 4:16 \"Akaenda Nazareti, hapo alipolelewa; na siku ya SABATO akaingia katika Sinagogi kama ilivyo DESTURI YAKE, akasimama ili asome.\" " +
                            "Hapo tunajifunza ya kwamba ilikuwa desturi ya YESU kuingia katika sinagogi siku ya SABATO. Kama tukingoja hata siku ya kwanza ya juma " +
                            "kupumzika pamoja na Kristo, tutakuwa tumechelewa sana.\n" +
                            "MUNGU ametia mibaraka katika kuishika SABATO ya siku ya SABA (Mwanzo 2:3; na Kutoka 20:8-11), na hakuna siku nyingine tena aliyoibariki " +
                            "namna hiyo. Je, waweza kuupata mbaraka wa SABATO kama ukipumzika siky ya kwanza ya juma?\n" +
                            "Unaweza kuupata mbaraka wa SABATO tu ukienenda kama vile Kristo alivyoenenda. Je, usingependa kuupata mbaraka huo?\n\n" +
                            "7. Je, Sabato iligeuzwa baada ya Kristo kusulubiwa?\n\n" +
                            "Soma mafungu haya yafuatayo, kisha ujikatie shauri mwenyewe.\n" +
                            "\t(a) Mathayo 28:1 \"Hata SABATO ilipokwisha, ikapambazuka siku ya kwanza ya juma.\" TAZAMA: Mwisho wa Sabato ulikuja kabla ya siku " +
                            "ya kwanza ya juma. YESU alikuwamo kaburini tayari. Mathayo hakujua badiliko lo lote alipokuwa akiiandika Injili yake.\n" +
                            "\t(b) Marko 16:1,2 \"Hata SABATO ilipokwisha kupita, Mariamu Magdalene na Mariamu mama yake Yakobo, na Salome, walinunua manukato wapate " +
                            "kwenda kumpaka. Hata alfajiri mapema, siku ya kwanza ya juma, wakaenda kaburini, jua lilipoanza kupambazuka.\" TAZAMA: Siku ya kwanza " +
                            "ya juma ilipofika, Sabato ilikuwa imekwisha kupita. Kwa hakika Marko hakujua badiliko lolote juu ya Sabato alipoyaandika mambo haya.\n" +
                            "\t(c) Luka naye vile vile hakujua juu ya mageuzi yo yote, kwani katika Luka 23:54, 24:1, twasoma ya kwamba YESU alizikwa mnamo \"Siku ya " +
                            "maandalio, (Ijumaa kuu) na Sabato ikaanza kuingia\" na rafiki za YESU \"Siku ya SABATO walistarehe kama ilivyoamriwa.\" Kisha katika \"" +
                            "Siku ya kwanza ya juma (jumapili) ilipoanza kupambazuka, walikwenda kaburini, wakiyaleta manukato waliyoweka tayari.\" Je, kama " +
                            "kulikuwako na mageuzi yo yote juu ya Sabato si ajabu ya kwamba rafiki za YESU na wale watu watakatifu walioziandika Injili, hawakujua lo lote juu ya " +
                            "badiliko la namna hiyo?\n" +
                            "\t(d) Kabla ya kufa, YESU aliwaambia wanafunzi wake juu ya kuanguka kwa Yerusalemu, kama ilivyoandika katika Mathayo 24. Aliwaambia " +
                            "waombe ili kukimbia kwao kusiwe katika siku ya Sabato. Na sasa, kuanguka kwa Yerusalemu hakukutokea upesi, mpaka A.D 70 karibu miaka " +
                            "arobaini baada ya kufa kwake. YESU alijua ingechukua muda huo, bali bado aliwaonya juu ya jambo hilo na kuwauliza waombe, yaani hata " +
                            "ingawa majeshi ya Warumi yangezunguka mji na maisha yao kuwa katika hatari wasingejaribu kukimbia katika siku ya SABATO. \n" +
                            "KUMBUKA: YESU alikufa kwa sababu zile amri kumi haziwezi kugeuzwa wala kubadilishwa\n\n" +
                            "8. Je, YESU alituamuru tupumzike siku gani ya juma kwa heshima ya ufufuo wake?\n\n" +
                            "Sheria namna ile haionekani mahali popote katika maandiko Matakatifu, walakini Paulo atuambia kuwa, ubatizo ni ukumbusho wa kifo na ufufuo wa Kristo " +
                            "(Warumi 6:4,6), na ya kwamba upo mkate na mvinyo katika meza ya Bwana yaonesha mauti ya Bwana hata atakapokuja. 1 Wakorintho 11:26. " +
                            "Kanuni hizi mbili ni za ukumbusho wa kifo cha YESU na ufufuo wake, bali SABATO ya siku ya SABA ni ukumbusho wa uumbaji wa ulimwengu, vitu " +
                            "viwili tofauti kabisa.\n\n" +
                            "9. Je, kuna mtume ye yote wa YESU aliyeishika SABATO ya siku ya saba?\n\n" +
                            "Paulo aliishika Sabato, kwani katika Matendo 13:14,42,44; na katika Matendo 16:13 na Matendo 17:2; kisha tena katika Matendo 18:4,11 " +
                            "twasoma kuhusu kuhubiri kwake kwa Wayahudi na kwa Mataifa katika siku za Sabato.\n\n" +
                            "10. YESU atakapofanya mbingu mpya na nchi mpya, ni siku ipi itakayotunzwa na watoto wake kuwa siku ya ibada?\n\n" +
                            "\"Na itakuwa ... SABATO hata SABATO, wanadamu wote watakuja kuabudu mbele zangu, asema Bwana.\" (Isaya 66:22,23). Msomaji; kama YESU " +
                            "angalikuwamo duniani leo, ni siku ipi angaliitunza kama Sabato? Jumamosi ama Jumapili?\n\n"
                    /*"Maswali ya Somo la 17"*/),
            new Lessons("Somo la 18", "Jinsi Watoto wa MUNGU Waishikavyo Siku Yake Takatifu.",
                    "Fungu la Kukariri: \"Ikumbuke siku ya SABATO uitakase.\" Kutoka 20:8\n\n" +
                            "UTANGULIZI.\n\n" +
                            "Je! Siku nyingine unajisikia umechoka? Sisi sote huutamani wakati wa kupumzika. Muumba wetu mpendwa, MUNGU aishiye, ajua kwamba " +
                            "tunahitaji kupumzika. Hivyo ametupa zawadi ya ajabu katika siku takatifu ya SABATO.\n\n" +
                            "ANASA KATIKA KUITUNZA SABATO.\n\n" +
                            "1. Je! Kutakaswa kwa SABATO kutakuwa ni kwa kufanya anasa ama ni siku ya furaha kwa mwanadamu?\n\n" +
                            "\"Kama ukigeuza mguu wako usiihalifu SABATO, usifanye anasa yako siku ya utakatifu wangu ... ukiita SABATO siku ya furaha, na siku TAKATIFU " +
                            "ya BWANA yeye HESHIMA...\" Isaya 58:13. ANGALIA: Katika siku za Kristo, Wayahudi walikuwa wameifanya SABATO kuwa mzigo na laana kwa kufuatia " +
                            "mapokeo yao wenyewe yaliyotungwa na watu. Kristo akayafutilia mbali mawazo haya yaliyotiwa na watu juu ya SABATO. Siku hiyo ilikusudiwa iwe " +
                            "ya furaha kwa wanadamu. Akasema; \"Sabato ilifanyika kwa ajili ya mwanadamu, si mwanadamu kwa ajili ya SABATO.\"\n\n" +
                            "2. Awezaje mtu kuitakasa SABATO?\n\n" +
                            "\"Akasema, uso wangu utakwenda pamoja nawe, nami nitakupa RAHA.\" Kutoka 33:14. Ni kuwako kwake YESU ambako kunapafanya mahali kuwa " +
                            "patakatifu. Ama kitu kuwa kiteule siku zote. Tunapoitakasa siku ya SABATO, twaingia katika raha na MUNGU. Tumpokeapo YESU katika mioyo " +
                            "yetu, twaipokea raha yake na pumziko lake (Mathayo 11:28-30).\n\n" +
                            "MWANZO NA MWISHO WA SABATO.\n\n" +
                            "3. Je, SABATO inaanza lini na kumalizika lini?\n\n" +
                            "\"Tangu jioni hata jioni, mtaishika hiyo SABATO yenu.\" Mambo ya Walawi 23:32. Maana ya neno \"JIONI\" ni MACHWEO YA JUA. \"... jioni, katika MACHWEO " +
                            "YA JUA.\" Kumbukumbu la Torati 16:6 na Marko 1:32. ANGALIA: Ili tuishike SABATO, ni lazima tuishike kama vile MUNGU alivyofanya. Jinsi MUNGU " +
                            "alivyozihesabu siku, ilikuwa ni toka MACHWEO YA JUA MPAKA MACHWEO YA JUA. Mwanzo 1:23. Hivyo twajua ya kwamba SABATO ya kweli huanzia " +
                            "jua lituapo jioni siku ya Ijumaa, na humalizika wakati jua lituapo katika siku ya Jumamosi jioni. Kamwe tusiuvunje huo mwanzo wa Sabato au " +
                            "ule mwisho wake.\n\n" +
                            "MAANDALIO YA SABATO.\n\n" +
                            "4. Je, tujiandae namna gani kwa ajili ya siku ya SABATO?\n\n" +
                            "\"Hata ikisha kuwa jioni, kwa sababu ya Maandalio, ndiyo siku iliyo kabla ya SABATO.\" Marko 15:42. Siku ya sita, Ijumaa, ndiyo siku ambayo " +
                            "tungefanya maandalio yote kabla ya kuingia kwa SABATO. Upishi wote, kutafuta kuni, kufua nguo na kung'arisha viatu; na kazi nyingenezo zote " +
                            "zifanywe katika siku hii ya Ijumaa. (Tafadhali soma mafundisho ya MUNGU katika Kutoka 16:5, 22-26). Kama maandalio haya hayatatizamwa " +
                            "katika siku ya Ijumaa, Sabato itavunjwa.\n" +
                            "Si lazima kula chakula cha baridi siku ya Sabato. Katika nyumba nyingi, chakula hutayarishwa katika siku ya sita (ijumaa, siku ya maandalio), " +
                            "na kupikwa; na siku ya Sabato hupashwa moto na kuliwa kikiwa kimepikwa tayari.\n\n" +
                            "UTUNZAJI MWEMA WA SABATO.\n\n" +
                            "5. Je, MUNGU anataka tuishike SABATO hata kama tuna kazi nyingi mno?\n\n" +
                            "\"Utafanya kazi siku sita, lakini katika siku ya SABA utapumzika; wakati wa kulima mashamba, na wakati wa kuvuna pia, utapumzika.\" " +
                            "Kutoka 34:21. Kuishika Sabato kwa muda, na kisha ufanye kazi fulani katika siku hiyo ya Sabato, ni vibaya zaidi ya kuikataa kabisa kuishika.\n\n" +
                            "6. Tuwe waangalifu kiasi gani kwa maneno yetu, mawazo yetu na matendo yetu katika siku ya SABATO?\n\n" +
                            "\"Kama ukigeuza mguu wako usiiharifu Sabato, usifanye anasa yako siku ya utakatifu wangu; ukiita Sabato siku ya furaha, na siku takatifu ya Bwana " +
                            "yenye heshima; ukiitunza, kwa kutozifanya njia zako mwenyewe, wala kuyatafuta yakupendezayo, wala kusema maneno yako mwenyewe.\" Isaya 58:13.\n" +
                            "\nANGALIA: (a) \"Njia zako mwenyewe\". Kazi zote za kidunia yapasa ziachwe kando katika siku ya Sabato. Kununua na kuuza kusifanyike " +
                            "katika siku ya Sabato (Nehemia 3:15-22). Mtu ye yote ambaye ana haraka ama harara juu ya kumalizika kwa Sabato ili apate kununua na kuuza " +
                            "ni mvunja Sabato. (Amosi 8:5) Kazi zote za kawaida za siku zote ni sharti ziwekwe kando na zisifanywe siku hiyo.\n" +
                            "(b) \"Maneno yako mwenyewe\". Vitabu na magazeti ya kidunia viwekwe kando. Sabato itumiwe katika kujifunza Neno la MUNGU, na katika " +
                            "kuyasoma magazeti na vitabu vya dini viburudishavyo. Mazungumzo yafanyike yale tu yamhusuyo MUNGU na kazi yake. Ni vema kuwachukua watoto " +
                            "kuwatembeza katika uoto wa asili, mandhali nzuri, bustani nzuri au hata hifadhi fulani, ama mashambani, kujitenga na shughuli za kidunia " +
                            "na taabu zake, na kuufurahia uzuri wa uumbaji wa MUNGU.\n\n" +
                            "7. Ni shughuli gani ziruhusiwazo kufanyika katika siku ya SABATO?\n\n" +
                            "\"Akawaambia, ni mtu yupi miongoni mwenu mwenye kondoo mmoja, na yule kondoo ametumbukia shimoni siku ya Sabato, asiyemshika akamwopoa? Je! Mtu " +
                            "ni bora kuliko kondoo mara ngapi? Basi NI HALALI KUTENDA MEMA SIKU YA SABATO.\" Mathayo 12:11,12.\n" +
                            "ANGALIA: Matendo ya hurumaa, kuponyesha shida na maumivu ni vema kufanywa katika siku ya Sabato. Wale wenye ng'ombe, mbuzi na kondoo " +
                            "hawawezi kuyakataa mahitaji ya wanyama hawa katika siku ya Sabato ama watasumbuka (Kazi za kuwashughulikia wanyama ziwezazo kufanywa " +
                            "katika siku sita za kazi zisingefanywa katika siku ya Sabato). Kutembelea wagonjwa, kuwapa dawa na kuwatunza kunaruhusiwa katika siku ya " +
                            "Sabato, bali kazi za kawaida za kila siku za Hospitali ama Zahanati ambazo zaweza kufanywa katika siku sita za kazi, zisingefanywa katika " +
                            "siku ya SABATO.\n\n" +
                            "8. Ni mikutano gani mtu awezayo kuhudhuria katika siku ya Sabato?\n\n" +
                            "\"Akaenda Nazareti, hapo alipolelewa, na siku ya Sabato akaingia katika Sinagogi kama ilivyo desturi yake, akasimama ili asome.\" Luka 4:16.\n" +
                            "ANGALIA: Katika kila Sabato Mwokozi alikwenda katika nyumba ya MUNGU kuabudu. Yeye ni mfano wetu, nasi pia, yatubidi tufanye juhudi ili " +
                            "kuhudhuria ibada kwa ajili ya kumwabudu MUNGU katika nyumba Yake kila Sabato. Mahali pasipo na kanisa watu waabudupo siku ya Sabato, waweza " +
                            "kukutanika pamoja na jamaa yako asubuhi na kujifunza masomo ya Shule ya Sabato yaliyotayarishwa, na uwe na mkutano wa faragha kwa ajili " +
                            "ya ibada katika nyumba yako. Ama ikiwa unao wenzako ambao mnao ushirika katika kulipenda neno la MUNGU, Mnaweza kukutanika pamoja katika " +
                            "nyumba mojawapo; kama ni yako ama ya mwenzio. Kuna miongozo maalum ya kujifunza Biblia kwa mwaka mzima inayoandaliwa na T.A.P (Tanzania " +
                            "Adventist Press). Fanya mpango kupata mwongozo wako kila baada ya miezi mitatu.\n\n" +
                            "MADAI YA WENYE KAZI\n\n" +
                            "8. Ikiwa wenye kazi au mamlaka wakimwamuru mtu aivunje SABATO, Je, akubali?\n\n" +
                            "\"MUNGU akanena maneno haya yote akasema ... Ikumbuke siku ya SABATO UITAKASE.\" Kutoka 20:8.\n" +
                            "\"Petro na mitume wakajibu wakisema, Imetupasa kumtii MUNGU kuliko wanadamu.\" Matendo 5:29.\n" +
                            "ANGALIA: Sisi ambao tu wafuasi wa YESU inabidi tusioneshe jeuri ya aina yo yote ama uovu wa heshima au nidhamu katika kuomba kwetu " +
                            "uhuru wa kuishika Sabato. Kwa upande mwingine, tunaamriwa kusimama imara katika haki, na kukataa kutomtii MUNGU. (Matendo 5:29-32)\n" +
                            "Mkristo wa kweli atamridhisha mwenye kazi kwa: Kufanya kazi na kupitisha saa za kawaida kila siku (Over time) kwa zile siku sita za kazi " +
                            "kufidia saa za Jumamosi ili Sabato ifikapo awe huru. Ama: Kufanya kazi siku ya Jumapili badala ya Sabato. Ama: Kukatwa mshahara wake " +
                            "wa zile siku za Sabato asizoifanyia kazi ikiwa hakuna wakati wo wote katika juma kuzitumikia saa zile. Mara nyingine mwenye kazi ayakataapo " +
                            "maombi yote, ni wajibu wa huyo mshika Sabato kutafuta kazi nyingine.\n" +
                            "Kumbuka ya kwamba, ikiwa mtu ataishika Sabato, MUNGU HATAMWACHA AFE KWA NJAA. (Tafadhali soma Isaya 58:13,14; na Zaburi 37:25)\n\n" +
                            "KUMBUKA\n" +
                            "Miongozo ya Kujifunza Biblia ina somo maalumu kwa kila Sabato. Nakala moja hutolewa kila Robo ya kila mwaka. Kila robo ina miezi mitatu. " +
                            "kwa hiyo kwa mwaka mzima nakala nne hutolewa.\n\n"
                    /*"Maswali ya Somo la 18"*/),
            new Lessons("Somo la 19", "Kwa Nini Watoto Wengi wa MUNGU Wameipuuzia Amri ya Nne?",
                    "Fungu la Kukariri: \"Nao waniabudu bure, wakifundisha mafundisho yaliyo maagizo ya wanadamu.\" Mathayo 15:9\n\n" +
                            "UTANGULIZI.\n\n" +
                            "Kwa nini basi watu wengi wanaiheshimu siku nyingine kando ya Sabato? Swali hili linaulizwa na watu milioni nyingi duniani kote. Je! " +
                            "Kuna jibu kwa swali hili? Ndiyo, jibu lipo.\n\n" +
                            "HAKUNA AMRI YA KUGEUZWA KWA SABATO YA SIKU YA SABA KATIKA AGANO JIPYA.\n\n" +
                            "1. Je, kuna amri mahali popote katika Biblia inayoagiza kubadilisha siku ya SABATO kwenda siku nyingine?\n\n" +
                            "La! Hakuna amri kama hiyo popote. Hebu tuone jinsi viongozi wengi wa makanisa mbali mbali wanavyosema juu ya amri kama hiyo:\n\n" +
                            "\t(a) Kanisa la Baptisti (Baptist Church)\n\n" +
                            "Dr. Edward T. Hiscox, mwandishi wa \"The Baptist Manual\" katika karatasi iliyosomwa mbele ya baraza, November 13, 1893 alisema hivi: \"" +
                            "Kulikuwa na iko amri inayoagiza kuitakasa siku ya Sabato, bali Sabato ile ilikuwa si Jumapili... Itasemekana, walakini, na kwa fahari za ushindi " +
                            "kwamba Sabato iligeuzwa toka siku ya saba mpaka siku ya kwanza ya juma... Bali ni wapi zipatikanapo habari za tendo kama hilo? Si " +
                            "katika Agano Jipya - la hasha. Hakuna ushuhuda wa Maandiko Matakatifu juu ya kufanyika kwa badiliko la kuigeuza Sabato toka siku ya saba " +
                            "mpaka siku ya kwanza ya juma.\"\n\n" +
                            "\t(b) (Church of England) Kanisa la Anglikana.\n\n" +
                            "Walter Farquhar Hook, DD. Vicar of Leeds asema: \"Kwa habari za siku ya Bwana (Jumapili) hatuwezi kutaja hata fungu moja katika Maandiko yote " +
                            "Matakatifu ya Agano Jipya ambalo linataja kwamba MUNGU aliamuru badiliko kama hilo ... Badiliko hilo la Sabato toka Jumamosi mpaka " +
                            "Jumapili halikutajwa kabisa, - ama, kwa kadiri niwezavyo kugundua, kufikiri, ni hao Wakristo wa kwanza. Hiyo Sabato basi ni kusema " +
                            "kushikwa kwa siku ya Jumamosi kwa siku ya Jumamosi kama siku iliyotengwa kwa ibada ya MUNGU, kupumzika kwa mwili na kuburudika kwa " +
                            "akili, ilikuwa ni amri ya MUNGU. Amri hii inayohusu Jumamosi ingeweza kugeuzwa na MUNGU tu, na MUNGU peke Yake.\n\n" +
                            "\t(c) (Lutheran Church) Kanisa la Walutheri.\n\n" +
                            "Professor George Sverdrup, Kiongozi katika kanisa la Kilutheri alilieleza wazo lifuatalo katika mwaka wa 1909: \"Kwa vile ambavyo " +
                            "hapawezi kupatikana mahali popote katika Maandiko Matakatifu pashuhudiapo ya kwamba, Bwana mwenyewe ama hao Mitume waliamuru kugeuzwa " +
                            "huko kwa Sabato toka Jumamosi mpaka Jumapili, basi ni vigumu kulijibu swali hilo, \'Ni nani aliyeigeuza Sabato, na ni nani aliyekuwa " +
                            "na mamlaka na uhalali wa kufanya hivyo?\'\"\n\n" +
                            "\t(d) (Roman Catholic Church) Kanisa la Katoliki la Rumi.\n\n" +
                            "James Cardinal Gibbons (RC) katika kitabu kiitwacho \"The Faith of our Fathers\" ukurasa wa 111 (1893), anatoa maelezo yafuatayo:\n" +
                            "\"Unaweza kuisoma Biblia toka Mwanzo hadi Ufunuo na wala hutapata hata fungu moja linaloruhusu kutakaswa kwa Jumapili. Maandiko Matakatifu " +
                            "yanaipa nguvu dini katika kuishika siku ya Jumamosi, siku ambayo sisi (Catholics) hatuitakasi kamwe.\"\n\n" +
                            "NI NANI ALIYEGEUZA SABATO TOKA JUMAMOSI KWENDA JUMAPILI?\n\n" +
                            "2. Je, kuna watu ambao wanadau kuwa wao ndio walioigeuza SABATO Takatifu ya Bwana kuwa jumapili?\n\n" +
                            "Ndiyo, Kuna watu namna hiyo. Mtume Paulo aliwaonya Wakristo wa kwanza ya kwamba kungetokea kuasi kweli, na ya kwamba mafundisho ya uongo " +
                            "yangetokea (Matendo 20:29,30; 2 Wathesalonike 2:7). Miaka kama 200 baada ya Kristo kuwako katika ulimwengu, wengine kati ya wale Wakristo " +
                            "wa kwanza walipotoshwa na kuiacha Sabato, wakaanza kuishika Jumapili. Soma maneno yafuatayo toka kitabu kiitwacho \"The Convert's " +
                            "Catechism Doctrine\" Tunapata maswali na majibu kama ifuatavyo:\n" +
                            "\"Swali: Sabato ni siku gani?\n" +
                            "Jibu: Jumamosi ndiyo Sabato\n" +
                            "Swali: Kwa nini huwa tunaishika Jumapili badala ya Jumamosi?\n" +
                            "Jibu: Tunashika Jumapili badala ya Jumamosi kwa sababu kanisa la Kirumi katika balaza la Leodicea (A.D 336) liliugeuza utukufu wa siku ya " +
                            "Jumamosi na kuhamishia katika siku ya Jumapili.\" Kwa nukuu ya maneno haya tunaweza kuona wazi ya kwamba Kanisa la Katoliki la Rumi hikiri " +
                            "kuwa Biblia haina amri inayoagiza Jumapili iwe siku takatifu, bali kanisa pekee ndilo linalohusika na mageuzi hayo. Historia pia inakubaliana na " +
                            "madai yake. \"Kwa mara ya kwanza nguvu ilitumika kuihehsimu siku ya Jumapili kwa wenyeji wa mji, mabaraza ya hukumu, watenda kazi wote, " +
                            "ilikuwa ni katika siku za mfalme Constantine, mwaka A.D 321 ... isipokuwa watu wale waliokuwa na kazi ya kilimo tu.\" \'Encyclopaedia " +
                            "Britannica, ninth edition, article \"Sunday.\" \"Sabato ya siku ya Saba ya juma ilitukuzwa na kushikwa na Kristo, na mitume, na Wakristo wote " +
                            "wa kwanza, mpaka baraza la Leodicea... lilipopitisha kuweka Jumapili kuwa siku ya Bwana. Wiliam Prynne's \"Dissertation on the Lord's " +
                            "Day.\" Kurasa 33,34,44.\n\n" +
                            "UNABII JUU YA KUIBADILISHA SABATO\n\n" +
                            "3. Je, kuna Unabii Wo Wote Katika Biblia Unaotabiri Kuhusu Mageuzi Ya Sabato?\n\n" +
                            "Danieli 7:25. \"Naye atanena maneno kinyume chake Aliye Juu, naye atawadhoofisha watakatifu wake Aliye Juu; naye ataazimu kubadili majira " +
                            "na sheria...\" Sheria za nani? Sheria za MUNGU. Na kwa vile amri ya nne ndiyo seheu ya sheria ihusianayo na swala lwa wakati tu, " +
                            "tusingestaajabu badiliko kama hilo geuko likipatikana hapo.\n\n" +
                            "JINSI AMRI ZA MUNGU ZILIVYOGEUZWA.\n\n" +
                            "4. Ni kwa kiasi gani sheria ya MUNGU ilibadilishwa na wanadamu?\n\n" +
                            "Kwa kuzipambanisha sheria hizi mbili yaani Sheria ya MUNGU na ile iliyowekwa na watu, twaweza kuona ya kwamba:\n" +
                            "\t(a) Ile sheria kama ilivyobadilishwa na mwanadamu haina ile amri ya pili ikatazayo kujifanyia sanamu.\n" +
                            "\t(b) Wala hiyo amri ya nne haiitaji ile amri ya Sabato kuwa ni siku gani, wala haimtaji yule mwasis wa Sabato kuwa ni nani, wala kuonesha " +
                            "ya kwamba ilifanywa kwa ukumbusho wa uumbaji.\n" +
                            "\t(c) Na hiyo amri ya kumi imegawanywa vipande viwili, ii ile hesabu ya amri iweze kutimia kumi sawa sawa.\n\n" +
                            "Ni nani aliyempa mwanadamu uwezo wa kuivuruga sheria? Hakika si MUNGU!\n" +
                            "Msomaji, utamfuata yupi - MUNGU au mwanadamu. Na ninaamini utasimama imara kama Petro na Mitume. (Matendo 5:29).\n\n" +
                            "Katika maneno yafuatayo hapo chini utaweza kujionea mwenyewe amri kama zilivyotolewa na MUNGU na pia zinavyofundishwa katika Katekismu " +
                            "ya Kanisa la Katoliki la Rumi.\n\n" +
                            "KAMA ZILIVYOTOLEWA NA MUNGU KATIKA BIBLIA\n\n" +
                            "1. Usiwe na miungu mingine ila mimi.\n" +
                            "2. Usijifanyie sanamu ya kuchonga, wala mfano wa kitu cho chote kilicho juu mbinguni, wala kilicho chini duniani, wala majini chini ya " +
                            "dunia. Usivisujudie wala kuvitumikia; kwa kuwa mimi, Bwana MUNGU wako, ni MUNGU mwenye wivu; nawapatiliza wana maovu ya baba zao, hata kizazi " +
                            "cha tatu na cha nne cha wanichukiao, nami nawarehemu maelfu elfu wanipendao, na kuzishika amri zangu.\n" +
                            "3. Usilitaje bure jina la Bwana MUNGU wako, maana Bwana hatamhesabia kuwa hana hatia mtu atajae jina lake bure.\n" +
                            "4. Ikumbuke siku ya Sabato uitakase. Siku sita fanya kazi, utende mambo yako yote; lakini siku ya saaba in SABATO ya Bwana, MUNGU wako, siku hiyo " +
                            "usifanye kazi yo yote, wewe, wala Mwana wako, wala binti yako, wala mtumwa wako, wala mjakazi wako, wala mnyama wako wa kufuga, wala mgeni aliye " +
                            "ndani ya malango yako. Maana, kwa siku sita Bwana alifanya mbingu na nchi na bahari, na vyote vilivyomo, akastarehe siku ya saba; kwa hiyo Bwana akaibarikia " +
                            "siku ya Sabato akaitakasa.\n" +
                            "5. Waheshimu baba yako na mama yako siku zako zipate kuwa nyingi katika nchi upewayo na Bwana MUNGU wako.\n" +
                            "6. Usiue\n" +
                            "7. Usizini\n" +
                            "8. Usiibe\n" +
                            "9. Usimshuhudie jirani yako uongo.\n" +
                            "10. Usiitamani nyumba ya jirani yako, usimtamani mke wa jirani yako, wala mtumwa wake, wala mjakazi wake wala ng'ombe wake, wala punda " +
                            "wake, wala cho chote alicho nacho jirani yako.\n\n" +
                            "KAMA ZIPATIKANAVYO KATIKA CATHOLIC CATECHISM\n\n" +
                            "1. Mimi ni Bwana MUNGU wako; usiwe na miungu mingine ila mimi\n" +
                            "2. Usilitaje jina la Bwana MUNGU wako bure.\n" +
                            "3. Shika kitakatifu siku ya MUNGU\n" +
                            "4. Mheshimu baba yako na mama yako.\n" +
                            "5. Usiue\n" +
                            "6. Usizini\n" +
                            "7. Usiibe\n" +
                            "8. Usimshuhudie uongo jirani yako\n" +
                            "9. Usimtamani mke wa jirani yako.\n" +
                            "10. Usiitamani mali ya jirani yako.\n\n"
                    /*"Maswali ya Somo la 19"*/),
            new Lessons("Somo la 20", "Watoto Wa MUNGU Wanalitafuta kanisa la MUNGU",
                    "Fungu la Kukariri: \"Na Kondoo wengine ninao. Ambao si wa zizi hili; na hao nao imenipasa kuwaleta; na sauti yangu " +
                            "wataisikia; kisha kutakuwako kundi moja na mchungaji mmoja\". Yohana 10:16.\n\n" +
                            "UTANGULIZI.\n\n" +
                            "Kabla ya kujifunza somo hili, Tafadhali angalia somo la 14, kuyarudia kwa ufupi yaliyosemwa pale kuhusu KANISA LA MUNGU. Je, " +
                            "awezaje mtu kutambua kanisa la kweli la MUNGU? Je! Ni sifa gani zinazolitambulisha kwamba hili ni kanisa la MUNGU? Je! litakuwa lile " +
                            "lililo na washiriki wengi zaidi duniani? Je! Twawezaje kulitambua kanisa la kweli la MUNGU na hali duniani tu kuna zaidi ya makanisa 5,000? " +
                            "Haya ndiyo maswali yatakayotafuta majibu yake katika somo hili.\n\n" +
                            "KULITAFUTA KANISA LA KWELI LA MUNGU\n\n" +
                            "1. Je, Kuna usalama kweli kusema kwamba kwa vile kanisa lile lina washiriki wengi zaidi, yumkini ndilo kanisa la kweli?\n\n" +
                            "HASHA! Mtu hawezi kuhukumu ni lipi kanisa la MUNGU kwa kufuata wingi wa idadi ya washiriki. Ni tangu lini kwa habari za dini watu " +
                            "wengi zaidi wakawa wafuasi waaminifu kwa ajili ya wingi wao? Mnamo siku za gharika, ulimwengu wote ulikuwa umepotoka isipokuwa Nuhu na nyumba " +
                            "yake tu. Je, ulikuwa ni upande wa watu wengi zaidi uliokuwa katika upande wa ukweli? LA! Katika siku za Ibrahim, ni yeye pekee tu " +
                            "ndiye asemekanaye kuwa alikuwa \"rafiki wa MUNGU\". Katika mji mwovu ule wa Sodoma; Lutu tu ndiye aliyeokolewa na nyumba yake asiteketezwe " +
                            "kwa moto uliouharibu mji. \"Ingieni kwa kupitia mlango ulio mwembamba; maana mlango ni mpana na njia ni pana iendeayo upotevuni, nao ni " +
                            "wengi waingiao kwa mlango huo. Bali mlango ni mwembamba na njia imesonga iendayo uzimani, nao waionao ni WACHACHE.\" Mathayo 7:13-14. " +
                            "Haya ni maneno ya YESU mwenyewe alipokuwa katika dunia. Viongozi wa dini hawakumwamini. (Soma Yohana 7:46-48; 1:11)\n\n" +
                            "2. Je, Kanisa la kweli ni lile ambalo wazazi wa mhusika ni washiriki?\n\n" +
                            "Mara nyingi unaweza kusikia wengine wakesema \"Mimi siwezi kuliacha kanisa la wazazi wangu.\" Kweli ni shida kabisa kufanya mageuzi kama yale. " +
                            "Basi ikiwa mtu yambidi kuwaheshimu sana wazazi wake wa hapa duniani, je, haimbidi awe na heshima kuu zaidi kwa yule MUNGU aliyemuumba na anayemsaidia? " +
                            "\"Basi zamani zile za ujinga MUNGU alijifanya kama hazioni, bali sasa anawaagiza watu wote wa kila mahali watubu\". Matendo 17:30. \"" +
                            "Mkihakiki ni nini impendezayo Bwana.\" Waefeso 5:10. Fungu hili hasa lasema hivi, \"Siku zote mkitafuta lile limpendezalo Bwana\".\n" +
                            "Yakobo asema hivi; \"Basi yeye ajuaye kutenda mema wala hatendi, kwake huyo ni dhambi.\" Yakobo 4:17. \"Bwana hutafuta-tafuta mioyo yote na " +
                            "kuyatambua mawazo yote ya fikira. Ukimtafuta, ataonekana nawe, ukimwacha, atakutupa milele.\" 1 Mambo ya Nyakati 28:9\n\n" +
                            "3. Je, Mtu anapotafuta kanisa la MUNGU la kweli ni salama kwake kumfuata mchungaji wake?\n\n" +
                            "Kumekuwa na watu watakatifu wa MUNGU wengi ambao wamemtumikia MUNGU kama wachungaji, ingawa hawakujua nia kamili ya Bwana kama " +
                            "inavyofunzwa katika Neno lake. Kumekuwako na wachungaji wengi pia ambao ni wachungaji wa mishahara na wamekataa kuyafuata maagizo ya " +
                            "Bwana, nao wamewaongoza wengine katika uasi. \"Makuhani hawakusema Yuko wapi Bwana? Wala wanasheria hawakunijua; WACHUNGAJI WAO WALINIASI.\" " +
                            "Yeremia 2:8. \"Ole wao WACHUNGAJI wanaoharibu kondoo za malisho yangu na kuwatawanya, asema Bwana.\" Yeremia 23:1. MUNGU pekee ndiye " +
                            "tuwezaye kumfuata. YESU alisema, \"Mimi ndimi njia, na kweli, na uzima.\" Yohana 14:6. Kuna watu wengine ambao wanashika haya na yale, " +
                            "si ya kwamba yanapatikana katika Neno la MUNGU bali kwamba ni mapokeo ya kanisa. \"Nao waniabudu bure. Wakifundisha mafundisho yaliyo " +
                            "maagizo ya wanadamu.\" Mathayo 15:9. \"Angalieni mtu asiwafanye mateka kwa elimu yake ya bure na madanganyo matupu, kwa jinsi ya mafundisho " +
                            "ya awali ya ulimwengu wala si kwa jinsi ya Kristo.\" Wakolosai 2:8.\n\n" +
                            "JINSI MTU ANAVYOWEZA KULITAMBUA KANISA LA KWELI LA MUNGU.\n\n" +
                            "4. Je, mtu awezaje kulitambua kanisa la kweli la MUNGU?\n\n" +
                            "Njia ya usalama pekee ni hii, kwamba kanisa hilo liwe ni lile linalofundisha kuhusu haki ile inayopatikana katika Neno la MUNGU. \"" +
                            "Iko njia ionekanayo kuwa sawa machoni pa mtu, lakini mwisho wake ni njia za mauti\". Mithali 16:25. Haimpasi mtu kuyaongoza maisha " +
                            "yake kufuatana na lile ambalo laonekana tu kuwa jema - ama kufuata yale ambayo watu wanasema kuwa ndiyo ya kweli; bali ni kwa kufuatia " +
                            "ambalo Neno la MUNGU lashuhudia kuwa ndiyo kweli yote. Kweli ni nini? \"Neno lako ndiyo kweli\". Yohana 17:17. Ni jambo muhimu kiasi " +
                            "gani kulijua Neno la MUNGU ili tusiweze kudanganywa na mafundisho ya wanadamu?\n\n" +
                            "5. Je, ni jambo gani bora ambalo kwalo mtu aweza kulitambua kanisa la MUNGU?\n\n" +
                            "Kanisa la kweli la MUNGU litaifundisha kweli yote kama inavyopatikana katika hili neno lake, na wala halitafunza mapokeo ya wanadamu. " +
                            "Rudia kusoma somo la 1 mpaka 19.\n\n" +
                            "MWITO ILI KUTOKA KATIKA BABELI.\n\n" +
                            "6. Neno la MUNGU linayaitaje makanisa yale ambayo si makanisa ya kweli?\n\n" +
                            "Kwa jinsi ambavyo tunayo makanisa mia nyingi duniani, kuna machafuko mengi kabisa katika fikara za watu wengi ya  kuhusu lipi ni kanisa " +
                            "la kweli. Katika Ufunuo 18:1-2 dunia hii iliyojawa na dini, inaitwa \"BABELI\" ambayo maana yake ni MACHAFUKO. Pia soma 2 Timotheo 3:1-5. " +
                            "Mafungu haya pia yanadhihirisha hali za wale ambao wanajidai kuwa ni wataua, bali wanaikana nguvu ya YESU katika maisha yao, yaani hawaepukani " +
                            "na dhambi. Mtu hawezi kufika mbinguni kwa njia ya machafuko. Bali kwa kulitii Neno La MUNGU.\n\n" +
                            "7. MUNGU anatoa wito gani kwa watoto wake waaminifu ambao bado wako \"Babeli\"? \n\n" +
                            "Ufunuo 18:4. \"Tokeni kwake, enyi watu wangu, msishiriki dhambi zake wala msipokee mapigo yake\". MUNGU asemapo \"Tokeni\" ana maana ya kile " +
                            "anachokisema tu. Alipomwambia Lutu na nyumba yake watoke Sodoma, alikuwa na maana watoke na kukimbia. Kama Lutu angalikataa kutoka " +
                            "pamoja na jamaa yake, hakika wangaliangamia kwa moto. MUNGU alipomwagiza Nuhu kutengeneza safina na kuingia humo, alimaanisha hivyo. Kama " +
                            "Nuhu na nyumba yake wangelikataa kumtii MUNGU wangaliangamia kwa maji ya gharika kama wale wengine walivyoangamia. Ni jambo muhimu " +
                            "sana kwa watoto wa MUNGU kutoka katika Babeli leo. ANGALIA: Katika Ufunuo 16, kuna habari zinazozungumzia kuhusu mapigo ya kuogofya " +
                            "ambayo yataiangukia dunia kabla ya YESU kuja. Katika fungu la 19, twaona kwamba Babeli unatajwa kuyapokea mapigo haya ya ghadhabu ya MUNGU. " +
                            "Adhabu ni ya wale ambao wanajidai kumwamini MUNGU na Neno Lake na huku wakifanya ibada ya bure.\n" +
                            "Cha kusikitisha ni kwamba si wote ambao wataitikia mwito wa MUNGU. Kila mmoja ni lazima akate shauri lake mwenyewe.\n" +
                            "Je, Msomaji, baada ya kuwa umejifunza mapenzi ya MUNGU, Je, kwa nini usikate shauri sasa? Je! Kwa nini usiondoke Babeli na machafuko yake " +
                            "yote? Kwa nini usijiunge na kanisa la kweli la MUNGU ambalo linazishika amri zote za MUNGU na kukutazamia kuja kwa YESU mara ya pili " +
                            "ambako ni karibu sana? Ikiwa unahitaji msaada katika kukata shauri hili lenye maana sana, viongozi wa SAUTI YA UNABII watafurahi kushauriana " +
                            "nawe. Waandikie. Huenda ungetaka kuonana na mmoja awezaye kukusaidia, tufahamishe. Ni mwito wa MUNGU mwenyewe unaokuita (Isaya 55:6,7)\n" +
                            "\nHili ndilo somo la mwisho katika mfululizo wa masomo haya 20. Yapo masomo ya hatua ya pili iwapo ungependa kujiendeleza nayo, " +
                            "tufahamishe nasi tutakutumia.\n\n" +
                            "Bwana akubariki sana. Usikose kutuandikia ikiwa utakuwa na swali lolote kutoka katika masomo haya uliyoyamaliza.\n\n"
                    /*"Maswali ya Somo la 20"*/)
    };

    //the constructor
    private Lessons(String title, String description, String content /*,String maswali*/) {
        this.title = title;
        this.description = description;
        this.content = content;
        //this.maswali = maswali;
    }

    //the setters and getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getContent() {
        return content;
    }

    /*public String getMaswali() {
        return maswali;
    }*/

    public String toString() {
        return this.title; //the string representation of a lesson is it's title.
    }
}
