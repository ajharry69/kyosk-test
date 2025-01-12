db = db.getSiblingDB('kyosk');

db.books.insertMany([
    {title: "The Hitchhiker's Guide to the Galaxy", id: "978-0345391803"},
    {
        title: "Pride and Prejudice", id: "978-0141439518"
    },
    {
        title: "To Kill a Mockingbird", id: "978-0060935467"
    }
]);