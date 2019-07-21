(ns net.minecraftforge.event.world.NoteBlockEvent$Note
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world NoteBlockEvent$Note]))

(def F_SHARP
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Note"
  NoteBlockEvent$Note/F_SHARP)

(def G
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Note"
  NoteBlockEvent$Note/G)

(def G_SHARP
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Note"
  NoteBlockEvent$Note/G_SHARP)

(def A
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Note"
  NoteBlockEvent$Note/A)

(def A_SHARP
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Note"
  NoteBlockEvent$Note/A_SHARP)

(def B
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Note"
  NoteBlockEvent$Note/B)

(def C
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Note"
  NoteBlockEvent$Note/C)

(def C_SHARP
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Note"
  NoteBlockEvent$Note/C_SHARP)

(def D
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Note"
  NoteBlockEvent$Note/D)

(def D_SHARP
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Note"
  NoteBlockEvent$Note/D_SHARP)

(def E
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Note"
  NoteBlockEvent$Note/E)

(def F
  "Enum Constant.

  type: net.minecraftforge.event.world.NoteBlockEvent$Note"
  NoteBlockEvent$Note/F)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (NoteBlockEvent.Note c : NoteBlockEvent.Note.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.event.world.NoteBlockEvent$Note[]`"
  ([]
    (NoteBlockEvent$Note/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.event.world.NoteBlockEvent$Note`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.event.world.NoteBlockEvent$Note [^java.lang.String name]
    (NoteBlockEvent$Note/valueOf name)))

