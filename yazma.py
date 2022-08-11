from time import sleep
from networktables import NetworkTables
from numpy import true_divide
NetworkTables.initialize(server='127.0.0.1') # SIMULASYON OLUŞTURDUĞUMUZ LOCAL IP ROBORIO İÇİN IPSINE SAHIP OLMANIZ GEREKMEKTE
#IP OGRENME HK
#USB Kablo uzerinden bağlanıyorsanız genelde 10.22.11.2 değerini alabilir 2 türlü öğrenilebilir
#1 DriverStation üzerinden bağlantı kurulu iken** SMARTDASHBoard açmak SmartDashboard Penceresinde ip gözükür 
#2 Roborio imager üzerinden ipyi görme
#Ethernet bağlantısı yapılmış Modem üzerinden alma yöntemleri:
#1 10.TE.AM.2 Örnek 7292 olan takım numarası almış roborio 10.72.92.2 ipye sahip olur 10.72.92.1 Modemin ipsi olur eğer modemle roborio bağlantısı tam ise.
#2 Aynı Driverstationda bağlantı kurduktan sonra smartdashboard pencerisini okuyarakta sahip olunabilir
#3 Internet tarıyıcınıza roborionun imaj yazılımında gördüğünüz hostname'i girerekte ip değerlerini görebilirsiniz.

tablo = NetworkTables.getTable("Tablo2")


i=0
bool = True
str= ["Merhaba","Dunya"]
a=0

while True:

    #PYTHON UZERINDEN JAVAYA DEGER GONDERME | YAZDIRMA ORNEKLERI:

    if a==2:
        a=0#ARALIKTAN CIKMASINI ENGELLIYORUZKI HATA VERMESIN
    tablo.putBoolean("x", bool) #TABLO2 DE X ICIN BOOLEAN DEGER VERIYORUZ
    tablo.putString("y", str[a]) #TABLO2 DE Y ICIN STRING DEGER VERIYORUZ
    tablo.putNumber("z", i) #TABLO2 DE Z ICIN SAYISAL DEGER VERIYORUZ
    tablo.putNumber("d", a) #TABLO2 DE D ICIN SAYISAL DEGER VERIYORUZ

    sleep(1)
    a=a+1
    i=i+1

        