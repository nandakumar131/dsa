fn main() {
    println!("Hello, world!");
    let a: &str = "Hello, world."; // a: &'static str
    println!("{}", a);

    let x = 10;
    println!{"{}", x};

    let x = 15;
    println!{"{}", x};

    let x: Bilbo = Bilbo {
        id: 10,
    };

    let hagrid = Bilbo {
        id: 11,
    };

    x.speak();
    some_func(x);
    hagrid.speak();

    let tup: (u16, bool, char) = (10, true, '😀');
    println!("{}", tup.2);
}

struct Bilbo {
    id: i8,
}

trait Language {
    fn speak(&self);
}

fn some_func <T: Language>(person: T) {
    person.speak();
}

impl Language for Bilbo {
    fn speak(&self) {
        println!("{}", self.id);
    }
}
