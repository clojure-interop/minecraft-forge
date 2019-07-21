(ns net.minecraftforge.client.settings.KeyConflictContext
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.settings KeyConflictContext]))

(def UNIVERSAL
  "Enum Constant.

  Universal key bindings are used in every context and will conflict with any other context.
   Key Bindings are universal by default.

  type: net.minecraftforge.client.settings.KeyConflictContext"
  KeyConflictContext/UNIVERSAL)

(def GUI
  "Enum Constant.

  Gui key bindings are only used when a GuiScreen is open.

  type: net.minecraftforge.client.settings.KeyConflictContext"
  KeyConflictContext/GUI)

(def IN_GAME
  "Enum Constant.

  In-game key bindings are only used when a GuiScreen is not open.

  type: net.minecraftforge.client.settings.KeyConflictContext"
  KeyConflictContext/IN_GAME)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (KeyConflictContext c : KeyConflictContext.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.client.settings.KeyConflictContext[]`"
  ([]
    (KeyConflictContext/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.client.settings.KeyConflictContext`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.client.settings.KeyConflictContext [^java.lang.String name]
    (KeyConflictContext/valueOf name)))

