package ru.javabegin.training.fastjava2.Lesson4;

public class ServerCluster {
    private final String OS_FOR_TLS = "OpenSuse";
    private final String OS_FOR_WEB_SERVER = "CentOS";
    private int versionOs;
    private String nameServer;
    private String guestOs;
    private int numberCpu;
    private int numberRam;
    private double numberStorage;
    private boolean serverStatus;

    public String getNameServer() {
        return nameServer;
    }

    public void setNameServer(String nameServer) {
        this.nameServer = nameServer;
    }

    public String getGuestOs() {
        return guestOs;
    }

    public void setGuestOs(String guestOs) {
        this.guestOs = guestOs;
    }

    public int getNumberCpu() {
        return numberCpu;
    }

    public void setNumberCpu(int numberCpu) {
        this.numberCpu = 0;
        if (numberCpu % 2 == 0 && numberCpu >= 1) {
            this.numberCpu = numberCpu;
        }
    }

    public int getNumberRam() {
        return numberRam;
    }

    public void setNumberRam(int numberRam) {
        this.numberRam = 0;
        if (numberRam > 0) {
            this.numberRam = numberRam;
        }
    }

    public double getNumberStorage() {
        return numberStorage;
    }

    public void setNumberStorage(double numberStorage) {
        this.numberStorage = 0;
        if (numberStorage > 0) {
            this.numberStorage = numberStorage;
        }
    }

    public boolean isServerStatus() {
        return serverStatus;
    }

    public void setServerStatus(boolean serverStatus) {
        this.serverStatus = serverStatus;
    }

    public int getVersionOs() {
        return versionOs;
    }

    public void setVersionOs(int versionOs) {
        this.versionOs = 7;
        if (versionOs >= 1 && versionOs <= 8) {
            this.versionOs = versionOs;
        }
    }

    public ServerCluster(int numberCpu, int numberRam, double numberStorage) { //по железу
        setNumberCpu(numberCpu);
        setNumberRam(numberRam);
        setNumberStorage(numberStorage);
    }

    public ServerCluster(String nameServer, String guestOs, boolean serverStatus) { //по имени и ОС
        setNameServer(nameServer);
        setGuestOs(guestOs);
    }

    public ServerCluster(String osIn, int versionOs) {
        if (osIn.equals(OS_FOR_TLS)) {
            printOs(OS_FOR_TLS);
        } else if (osIn.equals(OS_FOR_WEB_SERVER) && ((versionOs >= 1) && (versionOs <= 8))) {
            printOs(OS_FOR_WEB_SERVER, versionOs);
        } else {
            System.out.println("Не соответствует не одному из параметров.");
        }
    }

    static void printOs(String OS_FOR_WEB_SERVER) {
        System.out.println("TLS-сервер");
    }

    static void printOs(String OS_FOR_WEB_SERVER, int versionOs) {
        System.out.println("web-сервер");
    }

}

