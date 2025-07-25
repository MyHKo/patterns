class Singleton {
    static #instance:Singleton = null;
    static #isCreatingAllowed: boolean = false;
    #counter: number = 0;
    #message: string = "";

    constructor() {
        if(!Singleton.#isCreatingAllowed) {
            throw new Error("Cannot use Singleton constructor. Use getInstance() instead.");
        }
    }

    static getInstance(): Singleton {
        if (this.#instance == null) {
            this.#isCreatingAllowed = true;
            this.#instance = new Singleton();
            this.#isCreatingAllowed = false;
        }
        return this.#instance;
    }

    getCounter(): number {
        return this.#counter;
    }
    increment() : void {
        this.#counter++;
    }
    decrement() : void {
        this.#counter--;
    }

    setMessage(message: string) : void {
        this.#message = message;
    }
    getMessage(): string {
        return this.#message;
    }
}

const instance1: Singleton = Singleton.getInstance();
const instance2: Singleton = Singleton.getInstance();

instance1.increment()
instance2.setMessage("Hello Jupiter")
console.log(instance2.getCounter())
console.log(instance1.getMessage())
