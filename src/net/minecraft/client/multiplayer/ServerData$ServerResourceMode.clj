(ns net.minecraft.client.multiplayer.ServerData$ServerResourceMode
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.multiplayer ServerData$ServerResourceMode]))

(def ENABLED
  "Enum Constant.

  type: net.minecraft.client.multiplayer.ServerData$ServerResourceMode"
  ServerData$ServerResourceMode/ENABLED)

(def DISABLED
  "Enum Constant.

  type: net.minecraft.client.multiplayer.ServerData$ServerResourceMode"
  ServerData$ServerResourceMode/DISABLED)

(def PROMPT
  "Enum Constant.

  type: net.minecraft.client.multiplayer.ServerData$ServerResourceMode"
  ServerData$ServerResourceMode/PROMPT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ServerData.ServerResourceMode c : ServerData.ServerResourceMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.multiplayer.ServerData$ServerResourceMode[]`"
  ([]
    (ServerData$ServerResourceMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.multiplayer.ServerData$ServerResourceMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.multiplayer.ServerData$ServerResourceMode [^java.lang.String name]
    (ServerData$ServerResourceMode/valueOf name)))

(defn get-motd
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^ServerData$ServerResourceMode this]
    (-> this (.getMotd))))

