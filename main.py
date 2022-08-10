from networktables import NetworkTables
NetworkTables.initialize(server='127.0.0.1')
tablo = NetworkTables.getTable("Vision")


while True:
    print(tablo.getString("cx", "0"))