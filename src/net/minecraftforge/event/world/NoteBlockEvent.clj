(ns net.minecraftforge.event.world.NoteBlockEvent
  "Base class for Noteblock Events"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world NoteBlockEvent]))

(defn get-note
  "Get the Note the Noteblock is tuned to

  returns: the Note - `net.minecraftforge.event.world.NoteBlockEvent$Note`"
  (^net.minecraftforge.event.world.NoteBlockEvent$Note [^NoteBlockEvent this]
    (-> this (.getNote))))

(defn get-octave
  "Get the Octave of the note this Noteblock is tuned to

  returns: the Octave - `net.minecraftforge.event.world.NoteBlockEvent$Octave`"
  (^net.minecraftforge.event.world.NoteBlockEvent$Octave [^NoteBlockEvent this]
    (-> this (.getOctave))))

(defn get-vanilla-note-id
  "get the vanilla note-id, which contains information about both Note and Octave. Most modders should not need this.

  returns: an ID for the note - `int`"
  (^Integer [^NoteBlockEvent this]
    (-> this (.getVanillaNoteId))))

(defn set-note
  "Set Note and Octave for this event.
   If octave is Octave.HIGH, note may only be Note.F_SHARP

  note - the Note - `net.minecraftforge.event.world.NoteBlockEvent$Note`
  octave - the Octave - `net.minecraftforge.event.world.NoteBlockEvent$Octave`"
  ([^NoteBlockEvent this ^net.minecraftforge.event.world.NoteBlockEvent$Note note ^net.minecraftforge.event.world.NoteBlockEvent$Octave octave]
    (-> this (.setNote note octave))))

