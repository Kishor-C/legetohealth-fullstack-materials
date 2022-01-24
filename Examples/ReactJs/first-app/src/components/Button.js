import React, {Component} from "react";
export class Simple extends React.Component {
    handleButton = (event) => {
        console.log('handleButton!')
        console.log(event);
    }
    render() {
        return (<div>
            <button onClick = {(event) => {console.log(event)}}>Simple Button</button>
            <button onClick = {this.handleButton}>Second Button</button>
        </div>)
    }
}
export function Input() {
    return (<div>
        <input type = 'text' onChange = {(event) => {console.log(event)}}/>
        <button onClick = {(event) => {console.log(event)}}>Click2</button>
    </div>)
}
function Button() {
    //callback would handle the events
    let handleClick = (event) => {
        console.log(event);
    }
    return (<div>
        <button onClick = {handleClick}>Click</button>
    </div>)
}

export default Button;