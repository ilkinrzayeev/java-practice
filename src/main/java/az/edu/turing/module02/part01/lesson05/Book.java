package az.edu.turing.module02.part01.lesson05;

class Book {
    // some code here
}

class ScienceBook extends Book {
    // some code here
}

class Fiction extends Book {
    // some code here
}

class Fantasy extends Fiction {
    // some code here
}

class ScienceLibrary {
    ScienceBook[] books = new ScienceBook[100];

    public ScienceLibrary() {
        books[0] = new ScienceBook();
    }
}
