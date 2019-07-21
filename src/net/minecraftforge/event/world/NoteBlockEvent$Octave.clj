(ns net.minecraftforge.event.world.NoteBlockEvent$Octave
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world NoteBlockEvent$Octave]))

(def LOW
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Octave"
  NoteBlockEvent$Octave/LOW)

(def MID
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Octave"
  NoteBlockEvent$Octave/MID)

(def HIGH
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Octave"
  NoteBlockEvent$Octave/HIGH)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (NoteBlockEvent.Octave c : NoteBlockEvent.Octave.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.event.world.NoteBlockEvent$Octave[]`"
  ([]
    (NoteBlockEvent$Octave/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.event.world.NoteBlockEvent$Octave`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.event.world.NoteBlockEvent$Octave [^java.lang.String name]
    (NoteBlockEvent$Octave/valueOf name)))

