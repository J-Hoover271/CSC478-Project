#Course Project: UNO (Java)

A 2–4 player desktop version of the card game UNO, written in Java. You play against 1–3 AI opponents in a basic graphical interface. Built as a class project by Group 3.


## Features

- Complete game flow: new game, play a hand, view scores, end-of-game screen with a play-again option
- Standard UNO cards, including Wild, Wild Draw Four, Draw Two, Skip, and Reverse
- 1 human player against 1–3 AI opponents that make legal, reasonable moves
- Illegal moves (not matching color or number/symbol) are rejected
- Basic GUI showing your hand, the draw pile, the discard pile, and all players' scores
- Game logic kept separate from the user interface so the UI can be swapped out later

## Rules Summary

| Setting | Value |
|---|---|
| Deck | 108 cards |
| Players | 2–4 (1 human + 1–3 AI) |
| Starting hand | 10 cards each |
| Winning score | 500 points |

**Playing a turn.** On your turn, play a card that matches the top card of the discard pile by color or by number/symbol, or play a Wild card. If you can't play, you must draw cards until you pick up one you can play.

**Rounds.** A round ends as soon as a player discards their last card. Every other player's remaining cards are given to the winner and counted as points. Rounds continue until a player reaches 500 points.

**Card values:**

| Card | Points |
|---|---|
| Number cards (0–9) | Face value |
| Draw Two / Skip / Reverse | 20 each |
| Wild / Wild Draw Four | 50 each |

## Requirements

- JDK 17 or newer
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- Git

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/<owner>/<repo>.git
   ```
2. In IntelliJ, choose **File → Open** and select the cloned folder.
3. Make sure a JDK is set under **File → Project Structure → Project → SDK**.
4. Open the main class (`Main.java`) and click the green run arrow next to `main`.

## Building the Executable JAR

Using IntelliJ:

1. Go to **File → Project Structure → Artifacts**.
2. Click **+ → JAR → From modules with dependencies**.
3. Select the module and the main class, then click **OK**.
4. Go to **Build → Build Artifacts → Build**.

The JAR is created in the `out/artifacts/` folder.

## Running the JAR

```bash
java -jar out/artifacts/<artifact-name>/<artifact-name>.jar
```

Requires the same JDK version listed above.

## Testing

Unit tests cover the deck, move legality checks, and scoring. To run them in IntelliJ, right-click the test source folder and choose **Run 'All Tests'**.

## Project Scope

**In scope:** the standard 108-card game with wild, draw, skip, and reverse cards; scoring to 500; 1 human and 1–3 AI players; a basic GUI; unit tests for core game logic.

**Out of scope:** online play, accounts/saved games/statistics, rule variants, advanced AI, animations/sound/custom art, and mobile or web versions.

## Team Workflow

- Keep `main` in a working state: it should always build and pass tests.
- Create a branch for each feature or fix (for example, `feature/deck` or `fix/scoring`).
- Open a pull request and get at least one teammate to review it before merging.
- Pull the latest `main` before starting new work.

## Team

- [Jacob Hoover](https://github.com/username1)
- [Samantha Flores](https://github.com/username2)
- [Sophie Hatch](https://github.com/username3)
