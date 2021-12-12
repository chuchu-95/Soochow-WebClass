const div_test = document.getElementById("test");
const div_readme = document.getElementById("readme");
const div_question = document.getElementById("question");
const div_result = document.getElementById("result");


let right = 0;
let wrong = 0;

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

function showTestAndJudge(){
    div_test.style.display = "block";
    div_readme.style.display = "none"; 
    const v1 = Math.ceil(Math.random()*10);
    const v2 = Math.ceil(Math.random()*10);
    const opt_idx = Math.round(Math.random()*3);
    // console.log(v1)
    div_question.innerHTML = `<h2>${v1} ${operators[opt_idx]} ${v2} = <h2>`;
    eval(`answer = ${v1} ${operators[opt_idx]} ${v2}`);
}

let questionNum = 0;
const next_button = document.getElementById("next-button");
next_button.addEventListener('click', judgeRes);

function judgeRes(){
    //Test Page
    if(user_input.value == ""){
        alert("invalid!!");
    }
    else{
        const userInput = +user_input.value;
        if(userInput===answer)
            right ++;
        else    
            wrong ++;
        questionNum ++;
        showTestAndJudge();
        if(questionNum > num-1){
            alert("This is the last question!!");  
            endTest();
        }
    }
}
    

const end_button = document.getElementById("end-test-button");
end_button.addEventListener('click', endTest);
function endTest(){
    div_test.style.display = "none";
    div_readme.style.display = "none";
    div_result.style.display = "block";
    if(questionNum != num){
        wrong = num - right;
    }
    div_result.innerHTML = `<h2>你好，这是你的成绩：</h2><h1>您答对了${right}题 答错了${wrong}题 <h1>`;
}