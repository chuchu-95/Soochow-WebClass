from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/login', methods = ["POST"])
def login():
    if request.form['username'] == "武楚楚" and request.form['password'] == "1927406017":
        return redirect(url_for("showGrade"))
    else:
        return redirect(url_for("showError"))
    # return '{} {}'.format(request.form['username'], request.form['password'])

@app.route('/error')
def showError():
    return render_template('showError.html')

@app.route('/showGrades')
def showGrade():
    grades = {"Math":60, "English":60, "DataBase": 60}
    return render_template("showGrades.html", grades = grades )

if __name__ == '__main__':
    app.run(debug = True)
