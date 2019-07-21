(ns net.minecraftforge.event.world.NoteBlockEvent$Instrument
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world NoteBlockEvent$Instrument]))

(def PIANO
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Instrument"
  NoteBlockEvent$Instrument/PIANO)

(def BASSDRUM
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Instrument"
  NoteBlockEvent$Instrument/BASSDRUM)

(def SNARE
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Instrument"
  NoteBlockEvent$Instrument/SNARE)

(def CLICKS
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Instrument"
  NoteBlockEvent$Instrument/CLICKS)

(def BASSGUITAR
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Instrument"
  NoteBlockEvent$Instrument/BASSGUITAR)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (NoteBlockEvent.Instrument c : NoteBlockEvent.Instrument.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.event.world.NoteBlockEvent$Instrument[]`"
  ([]
    (NoteBlockEvent$Instrument/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.event.world.NoteBlockEvent$Instrument`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.event.world.NoteBlockEvent$Instrument [^java.lang.String name]
    (NoteBlockEvent$Instrument/valueOf name)))

