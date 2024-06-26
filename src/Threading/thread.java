package Threading;

//Multi Threading in Java


class IncomingStock extends Thread{
    public void run() {
        for (int i = 1; i <= 6; i++) {
            System.out.println(i+" Stocks are incoming");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    void display(){
        System.out.println("Threading");
    }
}
class DespatchingStock extends Thread{
    public void run() {
        for (int i = 1; i <=6; i++) {
            System.out.println("Stocks are despatching: "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Main{
    public static void main(String[] args) throws InterruptedException {
        IncomingStock is=new IncomingStock();
        DespatchingStock ds=new DespatchingStock();
        is.setName("New Stock");
        System.out.println(is.getName());
        System.out.println(is.threadId());
        is.start();
        ds.start();
        is.join();
        ds.join();

        is.setPriority(Thread.MAX_PRIORITY);
        System.out.println(is.getPriority());


        System.out.println("The Stock is cleared successfully");

    }
}


// Multi Threading in Java

class SharedResource {
    private int stockCounter = 0;

    // Synchronized method to update the stock counter
    public synchronized void incrementStock() {
        stockCounter++;
        System.out.println("Stock count increased: " + stockCounter);
    }

    // Synchronized method to decrement the stock counter
    public synchronized void decrementStock() {
        stockCounter--;
        System.out.println("Stock count decreased: " + stockCounter);
    }
}

class IncomingStock1 extends Thread {
    private final SharedResource sharedResource;

    public IncomingStock1(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 1; i <= 6; i++) {
            sharedResource.incrementStock();
            System.out.println(i + " Stocks are incoming");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DespatchingStock1 extends Thread {
    private final SharedResource sharedResource;

    public DespatchingStock1(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 1; i <= 6; i++) {
            sharedResource.decrementStock();
            System.out.println("Stocks are despatching: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Main4 {
    public static void main(String[] args) throws InterruptedException {
        SharedResource sharedResource = new SharedResource();
        IncomingStock1 is = new IncomingStock1(sharedResource);
        DespatchingStock1 ds = new DespatchingStock1(sharedResource);

//        is.setName("New Stock");
//        System.out.println(is.getName());
//        System.out.println(is.threadId());
//        is.setPriority(Thread.MAX_PRIORITY);

        is.start();
        ds.start();

        is.join();
        ds.join();

        System.out.println("The Stock is cleared successfully");
    }
}
