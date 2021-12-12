from flask import Flask
import time

app = Flask(__name__)

@app.route("/who")
def hello_a():
    return "<p>1927406017-武楚楚</p>"

@app.route("/study")
def hello_b():
    return "<h1>数据结构</h1><h2>Python</h2><h3>Java</h3>"

@app.route("/")
def hello_default():
    return time.strftime("%Y-%m-%d %H:%M:%S", time.localtime())

if __name__ == "__main__":
    app.run(debug=True)