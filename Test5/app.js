const div_test = document.getElementById("test");
const div_readme = document.getElementById("readme");
const div_question = document.getElementById("question");
const div_result = document.getElementById("result");

let answers = new Array();


const input_num = document.getElementById("input-num");
const user_input = document.getElementById("user-input");
const operators = ['+', '-', '*', '/'];
let answer;
let num;

div_test.style.display = "none";
div_result.style.display = "none";


const start_button = document.getElementById("start-button");
start_button.addEventListener('click', First);
function First(){
    num = +input_num.value;
    if(input_num.value == ""){
        alert("Please input a num!")
        return false;
    }
    else{
        showTestAndJudge();
    }
}

let correctAnswer = "";
let question = "";

let checkSame = new Array();
function showTestAndJudge(){
    div_test.style.display = "block";
    div_readme.style.display = "none"; 
    const v1 = Math.ceil(Math.random()*10);
    const v2 = Math.ceil(Math.random()*10);
    const opt_idx = Math.round(Math.random()*3);
    // console.log(v1)
    question = `${v1} ${operators[opt_idx]} ${v2} = `;
    if(checkSame.indexOf(question) > -1){
        console.log(checkSame);
        showTestAndJudge();
    }
    checkSame.push(question);
    div_question.innerHTML = "<h2>" + question + "<h2>"
    eval(`answer = ${v1} ${operators[opt_idx]} ${v2}`);
    correctAnswer = question + String(answer);
}

let array = new Array();
let questionNum = 0;
const next_button = document.getElementById("next-button");
next_button.addEventListener('click', judgeRes);

function judgeRes(){
    //Test Page
    const userInput = +user_input.value;
    console.log(user_input.value)
    console.log(typeof user_input.value)
    let userAnswer;
    if(user_input.value == ""){
        userAnswer = question + "";
    }
    else{
        userAnswer = question + String(userInput);
    }
    if(userInput===answer){
        answers.push(new Array(userAnswer, new Array(true, "你做的很棒")));
    }
    else{
        answers.push(new Array(userAnswer, new Array(false, correctAnswer)));
    }    
        
    questionNum ++;
    showTestAndJudge();
    
    if(questionNum > num-1){
        alert("This is the last question!!");  
        endTest();
    } 

}

const condition = document.getElementById("condition");
const end_button = document.getElementById("end-test-button");

end_button.addEventListener('click', endTest);
function endTest(){
    div_test.style.display = "none";
    div_readme.style.display = "none";
    div_result.style.display = "block";
    for(let i = 0; i < answers.length; i ++){
        let li = document.createElement("li");
        li.innerHTML = `第${i+1}题：` + answers[i][0];
        li.className = "itemBox";
        li.style.display = "block";
        if (answers[i][1][0] == false){
            li.classList.add("redColor");
            li.classList.add("false");
        }
        else{
            li.classList.add("true");
        }
        li.addEventListener("click", ()=>{alert(answers[i][1][1])})
        condition.appendChild(li);
    }
    console.log(checkSame);
}

const just_showError = document.getElementById("just-showError");
just_showError.addEventListener('click', clickShowError);

function clickShowError(){
    const liTrue = document.getElementsByClassName("true");
    for(let i = 0; i < liTrue.length; i ++){
        liTrue[i].style.display = "none";
    }
}


const show_All = document.getElementById("showAll");
show_All.addEventListener('click', clickShowAll);
function clickShowAll(){
    const l = document.getElementsByTagName("li");
    for(let i = 0; i < l.length; i ++){
        l[i].style.display = "block";
    }
}
