const express = require('express');
const mongoose = require('mongoose');
const app = express();

mongoose.connect('mongodb://mongo:27017/test');

app.get('/data', (req, res) => {
    res.json({ message: "Hello from Backend + DB 🚀" });
});

app.listen(3000, () => {
    console.log("Server running on port 3000");
});
