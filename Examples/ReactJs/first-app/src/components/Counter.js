import React, {Component} from 'react'

export class Counter extends React.Component {
    constructor(props) {
        super(props);
        // initialize the state
        this.state = {likes : 0, dislikes : 0}
    }
    likesCounter = (event) => {
        this.setState(prevState => ({likes: prevState.likes + 1}));
    }
    dislikesCounter = (event) => {
        this.setState(prevState => ({dislikes: prevState.dislikes + 1}));
    }
    render() {
        return (<div>
            <h2>Counter Component</h2>
            <p>Like(s): {this.state.likes}</p>
            <p>Dislike(s): {this.state.dislikes}</p>
            <button className = 'btn btn-primary' onClick = {this.likesCounter}>Like</button>
            &nbsp;
            <button className = 'btn btn-primary' onClick = {this.dislikesCounter}>Dislike</button>
        </div>)
    }
}