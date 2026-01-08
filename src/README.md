# Music Streaming Library

A small Java library that provides simple models and helpers for working with music data: tracks, albums, artists, playlists, and light-weight persistence. Meant for learning, quick prototypes, or to drop into larger applications.

## Repository contents — classes & objects
- model.Track
    - Fields: id, title, artist, album, duration, genre, extra metadata
    - Common methods: getters/setters, equals, toString

- model.Album
    - Fields: id, title, artist, year, List<Track> tracks

- model.Artist
    - Fields: id, name, optional bio, List<Album> or List<Track> references

- model.Playlist
    - Fields: id, name, description, List<Track> tracks
    - Methods: add(track), remove(track), move(indexFrom, indexTo), shuffle(), sort(comparator)

- library.MusicLibrary (or LibraryManager)
    - Holds collections of Track/Album/Artist/Playlist
    - Provides search, filtering, and simple aggregation methods

- persistence.PlaylistStorage (JSON/CSV helpers)
    - Methods to load/save playlists to JSON or CSV files

- utils.TrackFilters / TrackSorters / DurationFormatter
    - Utilities for common filtering and display tasks

- examples.Main (or ExampleUsage)
    - Minimal usage examples demonstrating creation, search, and persistence

## Quick start
Requirements: Java 11+, Maven or Gradle.

Build (Maven):
mvn clean package

Simple example (pseudo-code):
Track t = new Track("1", "Song", "Artist", "Album", 210);
Playlist p = new Playlist("p1","Favorites");
p.add(t);
PlaylistStorage.save(p, "favorites.json");

## Notes
- The project focuses on data models and utilities; it does not implement a full audio player.
- Extend models or persistence to match your app's needs.

## Contributing
Open an issue or send a pull request. Keep changes focused and add tests for new behavior.

## License
Add a LICENSE file (e.g., MIT) to make reuse clear.