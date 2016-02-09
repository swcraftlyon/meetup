import React, { Component } from 'react';

const styles = {
  header: {
    display: 'flex',
    backgroundColor: '#3adbdb',
    textAlign: 'center'
  },
  title: {
    flex: 1,
    fontSize: '1.5rem',
    margin: '1rem'
  }
}

export class Header extends Component {
  render() {
    return (
      <header style={styles.header}>
        <p style={styles.title}>
          Meetup-like WebApp
        </p>
      </header>
    );
  }
}
