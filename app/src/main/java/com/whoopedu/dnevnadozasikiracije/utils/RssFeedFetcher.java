package com.whoopedu.dnevnadozasikiracije.utils;

import android.content.Context;

public class RssFeedFetcher {

    private static final String URL = "https://www.klix.ba/rss";

    private final RssFeedFetcherListener mListener;

    public RssFeedFetcher(RssFeedFetcherListener listener) {
        mListener = listener;
    }

    public void getRssFeed(Context ctx) {
        /*
        RequestQueue queue = Volley.newRequestQueue(ctx);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL,
                mListener::onRssFetchedRssFeed,
                error -> mListener.onFailedRssFetch()
        );

        queue.add(stringRequest);
        */
        mListener.onRssFetchedRssFeed(TEST);
    }

    public interface RssFeedFetcherListener {
        void onRssFetchedRssFeed(String feed);
        void onFailedRssFetch();
    }
    private static final String TEST =
                    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                    "<rss xmlns:content=\"http://purl.org/rss/1.0/modules/content/\" xmlns:webfeeds=\"http://webfeeds.org/rss/1.0\" xmlns:atom=\"http://www.w3.org/2005/Atom\" xmlns:media=\"http://search.yahoo.com/mrss/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" version=\"2.0\"><channel><title>Klix.ba - RSS</title>\n" +
                    "<link>https://www.klix.ba/</link>\n" +
                    "<description>Sve vijesti sa portala Klix.ba</description>\n" +
                    "<language>bs-ba</language>\n" +
                    "<copyright>Klix.ba 2021</copyright>\n" +
                    "<pubDate>Fri, 11 Jun 2021 20:24:57 +0200</pubDate>\n" +
                    "<image>\n" +
                    "<title>Klix.ba - RSS</title>\n" +
                    "<url>https://www.klix.ba/images/logo.png</url>\n" +
                    "<link>https://www.klix.ba/</link>\n" +
                    "</image>\n" +
                    "<webfeeds:logo>https://www.klix.ba/images/logo.png</webfeeds:logo>\n" +
                    "<webfeeds:cover image=\"https://www.klix.ba/images/logo.png\" />\n" +
                    "<item>\n" +
                    "<title>Izetbegović: U Travniku je potrebna izgradnja ceste i srednje škole</title>\n" +
                    "<link>https://www.klix.ba/vijesti/bih/izetbegovic-u-travniku-je-potrebna-izgradnja-ceste-i-srednje-skole/210611160</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/bih/izetbegovic-u-travniku-je-potrebna-izgradnja-ceste-i-srednje-skole/210611160</guid>\n" +
                    "<description><![CDATA[Predsjednik Stranke demokratske akcije (SDA) Bakir Izetbegović danas je sa članovima stranke posjetio Travnik.]]></description><category domain=\"https://www.klix.ba/vijesti/bih\">BiH</category><pubDate>Fri, 11 Jun 2021 20:14:00 +0200</pubDate>\n" +
                    "<dc:creator>FENA</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611160.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\"></media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Opozicija u Izraelu finalizirala dogovor o koaliciji, vlast preuzimaju u nedjelju</title>\n" +
                    "<link>https://www.klix.ba/vijesti/svijet/opozicija-u-izraelu-finalizirala-dogovor-o-koaliciji-vlast-preuzimaju-u-nedjelju/210611153</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/svijet/opozicija-u-izraelu-finalizirala-dogovor-o-koaliciji-vlast-preuzimaju-u-nedjelju/210611153</guid>\n" +
                    "<description><![CDATA[Izraelski političar Yair Lapid, osoba koja okuplja izraelsku opoziciju u borbi za preuzimanje vlasti, potpisao je dogovor sa sedam stranaka čime je ozvaničen novi saziv vlasti koja bi trebala biti potvrđena u nedjelju u izraelskom parlamentu.]]></description><category domain=\"https://www.klix.ba/vijesti/svijet\">Svijet</category><pubDate>Fri, 11 Jun 2021 19:57:00 +0200</pubDate>\n" +
                    "<dc:creator>V. K.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611153.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Bennett i Lapid predvode koaliciju (Foto:Twitter)</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Sarajevo: Policija nakon potjere savladala migranta u naselju Alipašino Polje</title>\n" +
                    "<link>https://www.klix.ba/vijesti/crna-hronika/sarajevo-policija-nakon-potjere-savladala-migranta-u-naselju-alipasino-polje/210611156</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/crna-hronika/sarajevo-policija-nakon-potjere-savladala-migranta-u-naselju-alipasino-polje/210611156</guid>\n" +
                    "<description><![CDATA[Pripadnici Ministarstva unutrašnjih poslova Kantona Sarajevo danas su u poslijepodnevnim satima u sarajevskom naselju Alipašino Polje nakon potjere priveli jednog migranta.]]></description><category domain=\"https://www.klix.ba/vijesti/crna-hronika\">Crna hronika</category><pubDate>Fri, 11 Jun 2021 19:39:00 +0200</pubDate>\n" +
                    "<dc:creator>V. K.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611156.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Foto: Klix.ba</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Wanda uživa s Icardijem u Zanzibaru, izazovnim podvodnim fotografijama privukla veliku pažnju</title>\n" +
                    "<link>https://www.klix.ba/sport/nogomet/wanda-uziva-s-icardijem-u-zanzibaru-izazovnim-podvodnim-fotografijama-privukla-veliku-paznju/210611155</link>\n" +
                    "<guid>https://www.klix.ba/sport/nogomet/wanda-uziva-s-icardijem-u-zanzibaru-izazovnim-podvodnim-fotografijama-privukla-veliku-paznju/210611155</guid>\n" +
                    "<description><![CDATA[Manekenka Wanda Nara uživa u romantičnom odmoru na Zanzibaru sa suprugom i zvijezdom PSG-a Maurom Icardijem, a Argentinka je iskoristila putovanje kako bi objavila brojne fotografije i snimke u bikiniju.]]></description><category domain=\"https://www.klix.ba/sport/nogomet\">Nogomet</category><pubDate>Fri, 11 Jun 2021 19:36:00 +0200</pubDate>\n" +
                    "<dc:creator>H. H.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611155.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Foto: Instagram</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Prelijepe scene s ulica Rima, Italijani i Turci zagrljeni pjevaju i čekaju utakmicu</title>\n" +
                    "<link>https://www.klix.ba/sport/nogomet/prelijepe-scene-s-ulica-rima-italijani-i-turci-zagrljeni-pjevaju-i-cekaju-utakmicu/210611152</link>\n" +
                    "<guid>https://www.klix.ba/sport/nogomet/prelijepe-scene-s-ulica-rima-italijani-i-turci-zagrljeni-pjevaju-i-cekaju-utakmicu/210611152</guid>\n" +
                    "<description><![CDATA[Navijači nogometnih reprezentacija Italije i Turske zajedno i u sjajnoj atmosferi čekaju početak utakmice između ovih timova u Rimu, a što će ujedno biti i prvi susret na Euru.]]></description><category domain=\"https://www.klix.ba/sport/nogomet\">Nogomet</category><pubDate>Fri, 11 Jun 2021 19:28:00 +0200</pubDate>\n" +
                    "<dc:creator>K. H.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611152.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\"></media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Ruska ambasada: UN mora raspravljati o Schmidtu, od toga će zavisiti naš stav o EUFOR-u</title>\n" +
                    "<link>https://www.klix.ba/vijesti/bih/ruska-ambasada-un-mora-raspravljati-o-schmidtu-od-toga-ce-zavisiti-nas-stav-o-eufor-u/210611026</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/bih/ruska-ambasada-un-mora-raspravljati-o-schmidtu-od-toga-ce-zavisiti-nas-stav-o-eufor-u/210611026</guid>\n" +
                    "<description><![CDATA[Ambasada Rusije u Bosni i Hercegovini potvdila je za Klix.ba da će insistirati da se Vijeće sigurnosti Ujedinjenih naroda očituje o imenovanju novog visokog predstavnika u BiH.]]></description><category domain=\"https://www.klix.ba/vijesti/bih\">BiH</category><pubDate>Fri, 11 Jun 2021 19:16:00 +0200</pubDate>\n" +
                    "<dc:creator>G. M.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611026.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Ilustracija: Shutterstock</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Sindikat se izborio za uvezivanje staža radnika bivšeg &quot;DC Šumarstva&quot;</title>\n" +
                    "<link>https://www.klix.ba/vijesti/bih/sindikat-se-izborio-za-uvezivanje-staza-radnika-bivseg-dc-sumarstva/210611147</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/bih/sindikat-se-izborio-za-uvezivanje-staza-radnika-bivseg-dc-sumarstva/210611147</guid>\n" +
                    "<description><![CDATA[Zahvaljujući angažmanu i istrajnosti Sindikata JP &quot;ŠPD Zeničko-dobojskog kantona&quot; d.o.o. Zavidovići, radnici koji su u ovom preduzeću uposleni iz bivšeg DC &quot;Šumarstvo&quot; mogu računati da će, kada steknu zakonske uvjete moći otići u zasluženu penziju, bez čekanja na uplatu neuvezanog staža.]]></description><category domain=\"https://www.klix.ba/vijesti/bih\">BiH</category><pubDate>Fri, 11 Jun 2021 19:07:00 +0200</pubDate>\n" +
                    "<dc:creator>N. O.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611147.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Foto: Facebook</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Sudar Audija i kamiona s prikolicom kod Zenice, saobraćaj se odvija otežano</title>\n" +
                    "<link>https://www.klix.ba/vijesti/crna-hronika/sudar-audija-i-kamiona-s-prikolicom-kod-zenice-saobracaj-se-odvija-otezano/210611150</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/crna-hronika/sudar-audija-i-kamiona-s-prikolicom-kod-zenice-saobracaj-se-odvija-otezano/210611150</guid>\n" +
                    "<description><![CDATA[Na magistralnom putu M-17 kod Zenice dogodila se saobraćajna nesreća, a za sada nema informacija o povrijeđenim osobama.]]></description><category domain=\"https://www.klix.ba/vijesti/crna-hronika\">Crna hronika</category><pubDate>Fri, 11 Jun 2021 19:01:00 +0200</pubDate>\n" +
                    "<dc:creator>E. M.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611150.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Foto: Čitatelj</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Pique najavio da će napustiti nogomet ako ga Koeman otpiše u Barceloni</title>\n" +
                    "<link>https://www.klix.ba/sport/nogomet/pique-najavio-da-ce-napustiti-nogomet-ako-ga-koeman-otpise-u-barceloni/210611149</link>\n" +
                    "<guid>https://www.klix.ba/sport/nogomet/pique-najavio-da-ce-napustiti-nogomet-ako-ga-koeman-otpise-u-barceloni/210611149</guid>\n" +
                    "<description><![CDATA[Defanizvac Barcelone Gerard Pique (34) najavio je da će do kraja karijere igrati samo za Barcelonu i da bi eventualni odlazak s Nou Campa značio i kraj njegove karijere.]]></description><category domain=\"https://www.klix.ba/sport/nogomet\">Nogomet</category><pubDate>Fri, 11 Jun 2021 18:53:00 +0200</pubDate>\n" +
                    "<dc:creator>H. H.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611149.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Pique je minule sezone u dresu Blaugrane odigrao 23 utakmice (Foto: EPA-EFE)</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Za pomoć privredi u Kantonu Sarajevo odobreno 8,9 miliona KM</title>\n" +
                    "<link>https://www.klix.ba/vijesti/bih/za-pomoc-privredi-u-kantonu-sarajevo-odobreno-8-9-miliona-km/210611141</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/bih/za-pomoc-privredi-u-kantonu-sarajevo-odobreno-8-9-miliona-km/210611141</guid>\n" +
                    "<description><![CDATA[Ministarstvo privrede KS-a objavilo je danas liste prihvaćenih i liste odbijenih prijava poslovnih subjekata po javnim pozivima za finansiranje pripadajućih poreza i doprinosa na minimalnu mjesečnu neto plaću (u FBiH) za period trajanja zabrane obavljanja djelatnosti u martu i aprilu 2021. godine.]]></description><category domain=\"https://www.klix.ba/vijesti/bih\">BiH</category><pubDate>Fri, 11 Jun 2021 18:51:00 +0200</pubDate>\n" +
                    "<dc:creator>N. O.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611141.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Adnan Delić</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Hadžem Hajdarević dobitnik Nagrade za književno djelo &quot;Hasan Kaimija&quot;</title>\n" +
                    "<link>https://www.klix.ba/magazin/kultura/hadzem-hajdarevic-dobitnik-nagrade-za-knjizevno-djelo-hasan-kaimija/210611148</link>\n" +
                    "<guid>https://www.klix.ba/magazin/kultura/hadzem-hajdarevic-dobitnik-nagrade-za-knjizevno-djelo-hasan-kaimija/210611148</guid>\n" +
                    "<description><![CDATA[Nagrada za književno djelo &quot;Hasan Kaimija&quot; i Povelja za životno djelo dodijeljene su danas u okviru tradicionalne Kulturno-vjerske manifestacije &quot;Dani Hasana Kaimije&quot; koja se već osamnaesti put održava početkom juna na području opštine Zvornik.]]></description><category domain=\"https://www.klix.ba/magazin/kultura\">Kultura</category><pubDate>Fri, 11 Jun 2021 18:46:00 +0200</pubDate>\n" +
                    "<dc:creator>FENA</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611148.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Hadžem Hajdarević (Foto: N. G./Klix.ba)</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Stefanos Tsitsipas u fenomenalnom meču izborio plasman u finale Roland Garrosa</title>\n" +
                    "<link>https://www.klix.ba/sport/tenis/stefanos-tsitsipas-u-fenomenalnom-mecu-izborio-plasman-u-finale-roland-garrosa/210611146</link>\n" +
                    "<guid>https://www.klix.ba/sport/tenis/stefanos-tsitsipas-u-fenomenalnom-mecu-izborio-plasman-u-finale-roland-garrosa/210611146</guid>\n" +
                    "<description><![CDATA[Grčki teniser Stefanos Tsitsipas (ATP: 5.) plasirao se u finale Roland Garrosa nakon što je u sjajnom meču pobijedio njemačkog igrača Alexandera Zvereva (ATP: 6) rezultatom 3:2 u setovima (6:3, 6:3, 4:6, 4:6, 6:3).]]></description><category domain=\"https://www.klix.ba/sport/tenis\">Tenis</category><pubDate>Fri, 11 Jun 2021 18:38:00 +0200</pubDate>\n" +
                    "<dc:creator>K. H.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611146.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\"></media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Rijeka Buna kod Mostara ponovno na udaru investitora i građevinskih mašina</title>\n" +
                    "<link>https://www.klix.ba/vijesti/bih/rijeka-buna-kod-mostara-ponovno-na-udaru-investitora-i-gradjevinskih-masina/210611101</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/bih/rijeka-buna-kod-mostara-ponovno-na-udaru-investitora-i-gradjevinskih-masina/210611101</guid>\n" +
                    "<description><![CDATA[Korito rijeke Bune na jugu mostarske općine ponovno je na udaru teških mašina zbog izgradnje privatnog hotela, iako su inspekcijske službe upoznate s tim problemom u više navrata.]]></description><category domain=\"https://www.klix.ba/vijesti/bih\">BiH</category><pubDate>Fri, 11 Jun 2021 18:37:00 +0200</pubDate>\n" +
                    "<dc:creator>G. Š.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611101.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\"></media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Čeferin opet prijeti Real Madridu, Juventusu i Barceloni: Pravda je spora, ali dostižna</title>\n" +
                    "<link>https://www.klix.ba/sport/nogomet/ceferin-opet-prijeti-real-madridu-juventusu-i-barceloni-pravda-je-spora-ali-dostizna/210611145</link>\n" +
                    "<guid>https://www.klix.ba/sport/nogomet/ceferin-opet-prijeti-real-madridu-juventusu-i-barceloni-pravda-je-spora-ali-dostizna/210611145</guid>\n" +
                    "<description><![CDATA[Predsjednik UEFA-e Aleksander Čeferin opet je upozorio Real Madrid, Juventus i Barcelonu da nisu izbjegli kaznu zbog Superlige rekavši da je pravda ponekad spora, ali uvijek dostižna.]]></description><category domain=\"https://www.klix.ba/sport/nogomet\">Nogomet</category><pubDate>Fri, 11 Jun 2021 18:04:00 +0200</pubDate>\n" +
                    "<dc:creator>K. H.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611145.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Aleksander Čeferin (Foto: EPA-EFE)</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Ukrajina prkoseći UEFA-i najavila da će nositi dresove sa zabranjenim sloganom</title>\n" +
                    "<link>https://www.klix.ba/sport/ukrajina-prkoseci-uefa-i-najavila-da-ce-nositi-dresove-sa-zabranjenim-sloganom/210611144</link>\n" +
                    "<guid>https://www.klix.ba/sport/ukrajina-prkoseci-uefa-i-najavila-da-ce-nositi-dresove-sa-zabranjenim-sloganom/210611144</guid>\n" +
                    "<description><![CDATA[Nakon što je jučer UEFA prihvatila dio žalbe koju je Rusija uputila zbog dresa ukrajinske nogometne reprezentacije za predstojeći Euro i primorala je da promijeni natpis na dresu, Ukrajina je odbacila takvu mogućnost i igrat će u prvobitno dizajniranim dresovima.]]></description><category domain=\"https://www.klix.ba/sport\">Sport</category><pubDate>Fri, 11 Jun 2021 18:04:00 +0200</pubDate>\n" +
                    "<dc:creator>H. H.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611144.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Rusi su se žalili na natpis koji je za njih uvredljiv (Foto: Twitter)</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Forto komentirao najave Vlade FBiH o nabavci vakcina: Nedorasli, bahati i opasni po život</title>\n" +
                    "<link>https://www.klix.ba/vijesti/bih/forto-komentirao-najave-vlade-fbih-o-nabavci-vakcina-nedorasli-bahati-i-opasni-po-zivot/210611134</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/bih/forto-komentirao-najave-vlade-fbih-o-nabavci-vakcina-nedorasli-bahati-i-opasni-po-zivot/210611134</guid>\n" +
                    "<description><![CDATA[Nakon što su iz ureda premijera FBiH Fadila Novalića poručili da Vlada Kantona Sarajevo samostalno nastavi s kupovinom vakcina Sputnik V, premijer KS Edin Forto poručio je kako bi takva procedura građane koštala još dva mjeseca bez vakcina.]]></description><category domain=\"https://www.klix.ba/vijesti/bih\">BiH</category><pubDate>Fri, 11 Jun 2021 17:44:00 +0200</pubDate>\n" +
                    "<dc:creator>V. K.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611134.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Edin Forto (Foto: I. Š./Klix.ba)</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Izraelski vojnici ubili palestinskog tinejdžera tokom sukoba na Zapadnoj obali</title>\n" +
                    "<link>https://www.klix.ba/vijesti/svijet/izraelski-vojnici-ubili-palestinskog-tinejdzera-tokom-sukoba-na-zapadnoj-obali/210611140</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/svijet/izraelski-vojnici-ubili-palestinskog-tinejdzera-tokom-sukoba-na-zapadnoj-obali/210611140</guid>\n" +
                    "<description><![CDATA[Izraelski vojnici ubili su iz vatrenog oružja palestinskog tinejdžera tokom sukoba na okupiranoj Zapadnoj obali u petak, saopćilo je palestinsko ministarstvo zdravstva.]]></description><category domain=\"https://www.klix.ba/vijesti/svijet\">Svijet</category><pubDate>Fri, 11 Jun 2021 17:33:00 +0200</pubDate>\n" +
                    "<dc:creator>FENA</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611140.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Foto: EPA-EFE</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>U općini Novi Grad počelo potpisivanje peticije za rješavanje problema korištenja garaža</title>\n" +
                    "<link>https://www.klix.ba/vijesti/bih/u-opcini-novi-grad-pocelo-potpisivanje-peticije-za-rjesavanje-problema-koristenja-garaza/210611138</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/bih/u-opcini-novi-grad-pocelo-potpisivanje-peticije-za-rjesavanje-problema-koristenja-garaza/210611138</guid>\n" +
                    "<description><![CDATA[Na području mjesnih zajednica u Saraj-Polju i Dobrinji, počelo je potpisivanje peticije za rješavanje problema korištenja garaža kojima upravlja KJKP &quot;Rad&quot;, a koje nisu dovoljno iskorištene zbog visoke cijene zakupa i lošeg održavanja.]]></description><category domain=\"https://www.klix.ba/vijesti/bih\">BiH</category><pubDate>Fri, 11 Jun 2021 17:31:00 +0200</pubDate>\n" +
                    "<dc:creator>V. K.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611138.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\"></media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Samit G7 otvoren dodirivanjem laktova na engleskom pijesku</title>\n" +
                    "<link>https://www.klix.ba/vijesti/svijet/samit-g7-otvoren-dodirivanjem-laktova-na-engleskom-pijesku/210611139</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/svijet/samit-g7-otvoren-dodirivanjem-laktova-na-engleskom-pijesku/210611139</guid>\n" +
                    "<description><![CDATA[Britanski premijer Boris Johnson u petak je pozdravio čelnike iz Grupe sedam i Evropske unije na drvenoj šetnici s tek brušenim pijeskom u Carbis Bayu na otvaranju samita G-7.]]></description><category domain=\"https://www.klix.ba/vijesti/svijet\">Svijet</category><pubDate>Fri, 11 Jun 2021 17:28:00 +0200</pubDate>\n" +
                    "<dc:creator>FENA</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611139.jpg?v=2\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Foto: EPA-EFE</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Bošnjaci Kiseljaka sjećaju se strašnih zločina koje je HVO počinio u junu '93. godine</title>\n" +
                    "<link>https://www.klix.ba/vijesti/bih/bosnjaci-kiseljaka-sjecaju-se-strasnih-zlocina-koje-je-hvo-pocinio-u-junu-93-godine/210611055</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/bih/bosnjaci-kiseljaka-sjecaju-se-strasnih-zlocina-koje-je-hvo-pocinio-u-junu-93-godine/210611055</guid>\n" +
                    "<description><![CDATA[Bošnjaci sela Grahovci, Han Ploča, Tulica i Radanovići u općini Kiseljak ovih dana prisjećaju se strašnih zločina koje su u ovome kraju u junu 1993. godine počinile jedinice Hrvatskog vijeća odbrane (HVO).]]></description><category domain=\"https://www.klix.ba/vijesti/bih\">BiH</category><pubDate>Fri, 11 Jun 2021 17:19:00 +0200</pubDate>\n" +
                    "<dc:creator>B. T.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611055.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Danas održani memorijalna šetnja i historijski čas</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Šta jedu Italijani tokom Eura? Jelovnik Azzurra &quot;zadovoljava um prije nepca&quot;</title>\n" +
                    "<link>https://www.klix.ba/sport/nogomet/sta-jedu-italijani-tokom-eura-jelovnik-azzurra-zadovoljava-um-prije-nepca/210611137</link>\n" +
                    "<guid>https://www.klix.ba/sport/nogomet/sta-jedu-italijani-tokom-eura-jelovnik-azzurra-zadovoljava-um-prije-nepca/210611137</guid>\n" +
                    "<description><![CDATA[Italija večeras igra premijernu utakmicu na Evropskom prvenstvu protiv Turske, a Azzurri u pripremi meča i tunira nisu ništa prepustili slučaju, uključujući i pažljivo birana jela.]]></description><category domain=\"https://www.klix.ba/sport/nogomet\">Nogomet</category><pubDate>Fri, 11 Jun 2021 17:11:00 +0200</pubDate>\n" +
                    "<dc:creator>H. H.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611137.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Svakom igraču ipak je dozvoljeno da na željeni način održava svoje prehrambene navike (Foto: EPA-EFE)</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Vlada KS će i ove godine subvencionirati troškove za upis djece u privatne vrtiće</title>\n" +
                    "<link>https://www.klix.ba/vijesti/bih/vlada-ks-ce-i-ove-godine-subvencionirati-troskove-za-upis-djece-u-privatne-vrtice/210611131</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/bih/vlada-ks-ce-i-ove-godine-subvencionirati-troskove-za-upis-djece-u-privatne-vrtice/210611131</guid>\n" +
                    "<description><![CDATA[Danas je na press konferenciji povodom početka upisa učenika u prvi razred srednje škole ministrica Naida Hota Muminović, između ostalog, otkrila kako Vlada Kantona Sarajevo i za ovu godinu planira subvencioniranje troškova za upis u privatne vrtiće za djecu sa liste čekanja]]></description><category domain=\"https://www.klix.ba/vijesti/bih\">BiH</category><pubDate>Fri, 11 Jun 2021 17:10:00 +0200</pubDate>\n" +
                    "<dc:creator>N. O.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611131.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Naida Hota Muminović</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Pripadnik Oružanih snaga BiH osuđen na tri mjeseca uvjetno zbog prijetnji Martini Mlinarević</title>\n" +
                    "<link>https://www.klix.ba/vijesti/bih/pripadnik-oruzanih-snaga-bih-osudjen-na-tri-mjeseca-uvjetno-zbog-prijetnji-martini-mlinarevic/210611136</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/bih/pripadnik-oruzanih-snaga-bih-osudjen-na-tri-mjeseca-uvjetno-zbog-prijetnji-martini-mlinarevic/210611136</guid>\n" +
                    "<description><![CDATA[Općinski sud u Ljubuškom donio je pravosnažnu presudu protiv Jurice Pavlovića iz Ljubuškog, pripadnika Oružanih snaga BiH (OSBiH), zbog prijeteće poruke koje je putem Facebooka uputio književnici Martini Mlinarević, aktuelnoj ambasadorici Bosne i Hercegovine u Češkoj Republici, saopćeno je iz Udruženja BH novinari.]]></description><category domain=\"https://www.klix.ba/vijesti/bih\">BiH</category><pubDate>Fri, 11 Jun 2021 16:57:00 +0200</pubDate>\n" +
                    "<dc:creator>FENA</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611136.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Foto: D. S./Klix.ba</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Okerić i Selimbegović najavili realizaciju nekoliko projekata u općini Novi Grad Sarajevo</title>\n" +
                    "<link>https://www.klix.ba/biznis/privreda/okeric-i-selimbegovic-najavili-realizaciju-nekoliko-projekata-u-opcini-novi-grad-sarajevo/210611127</link>\n" +
                    "<guid>https://www.klix.ba/biznis/privreda/okeric-i-selimbegovic-najavili-realizaciju-nekoliko-projekata-u-opcini-novi-grad-sarajevo/210611127</guid>\n" +
                    "<description><![CDATA[Nakon današnjeg sastanka predsjedavajućeg Skupštine Kantona Sarajevo Elvedina Okerića (NiP) i predsjedavajućeg Općinskog vijeća Novi Grad Sarajevo Mirze Selimbegovića (NiP) najavljena je realizacija nekoliko projekata u ovoj lokalnoj zajednici.]]></description><category domain=\"https://www.klix.ba/biznis/privreda\">Privreda</category><pubDate>Fri, 11 Jun 2021 16:46:00 +0200</pubDate>\n" +
                    "<dc:creator>B. R.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611127.jpg?v=3\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Elvedin Okerić i Mirza Selimbegović (Foto: Vlada KS)</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Policija traga za migrantom koji je počinio ubistvo u Vogošći</title>\n" +
                    "<link>https://www.klix.ba/vijesti/crna-hronika/policija-traga-za-migrantom-koji-je-pocinio-ubistvo-u-vogosci/210611128</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/crna-hronika/policija-traga-za-migrantom-koji-je-pocinio-ubistvo-u-vogosci/210611128</guid>\n" +
                    "<description><![CDATA[Ministarstvo unutrašnjih poslova Kantona Sarajevo raspisalo je potragu za osobom koja se sumnjiči da je u četvrtak počinila ubistvo na području Vogošće.]]></description><category domain=\"https://www.klix.ba/vijesti/crna-hronika\">Crna hronika</category><pubDate>Fri, 11 Jun 2021 16:44:00 +0200</pubDate>\n" +
                    "<dc:creator>V. K.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611128.jpg?v=2\">\n" +
                    "<media:credit scheme=\"urn:ebu\">MUP objavio fotografije osumnjičenog za ubistvo (Foto: MUP KS)</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Mađarska planira zabraniti sadržaje koji promoviraju homoseksualnost među mladima</title>\n" +
                    "<link>https://www.klix.ba/vijesti/svijet/madjarska-planira-zabraniti-sadrzaje-koji-promoviraju-homoseksualnost-medju-mladima/210611106</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/svijet/madjarska-planira-zabraniti-sadrzaje-koji-promoviraju-homoseksualnost-medju-mladima/210611106</guid>\n" +
                    "<description><![CDATA[Vladajuća partija u Mađarskoj Fidesz, čiji je predsjednik Viktor Orban, planira predložiti nacrt zakona o zabrani promocije homoseksualizma među mladim ljudima, kao i teme poput promjene spola.]]></description><category domain=\"https://www.klix.ba/vijesti/svijet\">Svijet</category><pubDate>Fri, 11 Jun 2021 16:44:00 +0200</pubDate>\n" +
                    "<dc:creator>V. K.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611106.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Zakon predložila Orbanova stranka Fidesz (Foto: EPA-EFE)</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Jokić otkrio kako je kao dječak odustao od košarke: Okrenuo sam se konjima</title>\n" +
                    "<link>https://www.klix.ba/sport/kosarka/jokic-otkrio-kako-je-kao-djecak-odustao-od-kosarke-okrenuo-sam-se-konjima/210611132</link>\n" +
                    "<guid>https://www.klix.ba/sport/kosarka/jokic-otkrio-kako-je-kao-djecak-odustao-od-kosarke-okrenuo-sam-se-konjima/210611132</guid>\n" +
                    "<description><![CDATA[Srbijanski košarkaš Nikola Jokić u intervju za zvanični Youtube kanal Denver Nuggetsa prisjetio se samog početka svoje karijere otkrivši da je u jednom trenutku prestao igrati ovaj sport i da se okrenuo konjima.]]></description><category domain=\"https://www.klix.ba/sport/kosarka\">Košarka</category><pubDate>Fri, 11 Jun 2021 16:44:00 +0200</pubDate>\n" +
                    "<dc:creator>K. H.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611132.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Nikola Jokić (Foto: Instagram)</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Košarac: BiH ne odustaje od onemogućavanja izgradnje odlagališta &quot;Trgovska gora&quot;</title>\n" +
                    "<link>https://www.klix.ba/vijesti/bih/kosarac-bih-ne-odustaje-od-onemogucavanja-izgradnje-odlagalista-trgovska-gora/210611133</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/bih/kosarac-bih-ne-odustaje-od-onemogucavanja-izgradnje-odlagalista-trgovska-gora/210611133</guid>\n" +
                    "<description><![CDATA[Ministar vanjske trgovine i ekonomskih odnosa Bosne i Hercegovine Staša Košarac izjavio je danas da BiH ne odustaje od stava da onemogući izgradnju odlagališta nuklearnog otpada na Trgovskoj gori.]]></description><category domain=\"https://www.klix.ba/vijesti/bih\">BiH</category><pubDate>Fri, 11 Jun 2021 16:42:00 +0200</pubDate>\n" +
                    "<dc:creator>FENA</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611133.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Foto: T. S./Klix.ba</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>U akciji čišćenja bh. voda od otpada očišćeno korito rijeke Željeznice</title>\n" +
                    "<link>https://www.klix.ba/vijesti/bih/u-akciji-ciscenja-bh-voda-od-otpada-ocisceno-korito-rijeke-zeljeznice/210611100</link>\n" +
                    "<guid>https://www.klix.ba/vijesti/bih/u-akciji-ciscenja-bh-voda-od-otpada-ocisceno-korito-rijeke-zeljeznice/210611100</guid>\n" +
                    "<description><![CDATA[Danas je u Sarajevu održana završna akcija čišćenja bh. voda od otpada koju organizuje kompanija Henkel u okviru projekta &quot;Zajedno za čiste vode BiH&quot;. Akcija je sprovedena na rijeci Željeznici, a njeno korito je očišćeno od znatne količine otpada.]]></description><category domain=\"https://www.klix.ba/vijesti/bih\">BiH</category><pubDate>Fri, 11 Jun 2021 16:41:00 +0200</pubDate>\n" +
                    "<dc:creator>N. O.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611100.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Akcija čišćenja voda BiH (Foto: T. S./Klix.ba)</media:credit>\n" +
                    "</media:content></item><item>\n" +
                    "<title>Nakon 60 godina počinje rekonstrukcija tramvajske pruge u Sarajevu, posao dobili Kinezi</title>\n" +
                    "<link>https://www.klix.ba/biznis/investicije/nakon-60-godina-pocinje-rekonstrukcija-tramvajske-pruge-u-sarajevu-posao-dobili-kinezi/210611130</link>\n" +
                    "<guid>https://www.klix.ba/biznis/investicije/nakon-60-godina-pocinje-rekonstrukcija-tramvajske-pruge-u-sarajevu-posao-dobili-kinezi/210611130</guid>\n" +
                    "<description><![CDATA[Nakon više od 60 godina počinje rekonstrukcija tramvajske pruge na dionici Marijin Dvor - Ilidža, a posao su dobili Kinezi.]]></description><category domain=\"https://www.klix.ba/biznis/investicije\">Investicije</category><pubDate>Fri, 11 Jun 2021 16:40:00 +0200</pubDate>\n" +
                    "<dc:creator>S. H.</dc:creator>\n" +
                    "<media:content width=\"850\" url=\"https://static.klix.ba/media/images/vijesti/b_210611130.jpg?v=1\">\n" +
                    "<media:credit scheme=\"urn:ebu\">Foto: Arhiv/Klix.ba</media:credit>\n" +
                    "</media:content></item></channel></rss>";

}
