from networktables import NetworkTables
NetworkTables.initialize(server='127.0.0.1') # SIMULASYON OLUŞTURDUĞUMUZ LOCAL IP ROBORIO İÇİN IPSINE SAHIP OLMANIZ GEREKMEKTE
#IP OGRENME HK
#USB Kablo uzerinden bağlanıyorsanız genelde 10.22.11.2 değerini alabilir 2 türlü öğrenilebilir
#1 DriverStation üzerinden bağlantı kurulu iken** SMARTDASHBoard açmak SmartDashboard Penceresinde ip gözükür 
#2 Roborio imager üzerinden ipyi görme
#Ethernet bağlantısı yapılmış Modem üzerinden alma yöntemleri:
#1 10.TE.AM.2 Örnek 7292 olan takım numarası almış roborio 10.72.92.2 ipye sahip olur 10.72.92.1 Modemin ipsi olur eğer modemle roborio bağlantısı tam ise.
#2 Aynı Driverstationda bağlantı kurduktan sonra smartdashboard pencerisini okuyarakta sahip olunabilir
#3 Internet tarıyıcınıza roborionun imaj yazılımında gördüğünüz hostname'i girerekte ip değerlerini görebilirsiniz.

tablo = NetworkTables.getTable("Tablo")


while True:
    #JAVA UZERINDEN GELEN DEGERLERI PYTHONDA OKUMA | YAZDIRMA ORNEKLERI:
    
    print(tablo.getBoolean("x", False)) # X DEGERINE TANIMLANMIS BOOLEAN DEGERI YAZDIRMA.
    print(tablo.getString("y", "defval")) # Y DEGERINE TANIMLANMIS STRING YAZDIRMA.
    print(tablo.getNumber("z", "defval")) # Z DEGERINE TANIMLANMIS SAYISAL DEGERI YAZDIRMA.
    print(tablo.getNumber("d", "defval")) # D DEGERINE TANIMLANMIS SAYISAL DEGERI YAZDIRMA.