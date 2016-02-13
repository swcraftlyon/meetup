import React, { Component } from 'react';

const styles = {
  footer: {
    padding: '0.5rem',
    fontSize: '1rem',
    backgroundColor: '#3adbdb',
    textAlign: 'center'
  }
}

export class Footer extends Component {
  render() {
    return (
      <footer style={styles.footer}>
        <a href="https://github.com/swcraftlyon/meetup" target="_blank">
          github
        </a>
        &nbsp;|&nbsp;
        <a href="https://lyontechhub.slack.com/messages/swcrafts_meetup" target="_blank">
          slack
        </a>
        &nbsp;|&nbsp;
        <a href="https://trello.com/b/zuo7PmoE/swcraftmeetup#" target="_blank">
          trello
        </a>
      </footer>
    );
  }
}
