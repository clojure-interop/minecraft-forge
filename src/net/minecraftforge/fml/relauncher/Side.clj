(ns net.minecraftforge.fml.relauncher.Side
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.relauncher Side]))

(def CLIENT
  "Enum Constant.

  The client side. Specifically, an environment where rendering capability exists.
   Usually in the game client.

  type: net.minecraftforge.fml.relauncher.Side"
  Side/CLIENT)

(def SERVER
  "Enum Constant.

  The server side. Specifically, an environment where NO rendering capability exists.
   Usually on the dedicated server.

  type: net.minecraftforge.fml.relauncher.Side"
  Side/SERVER)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Side c : Side.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.fml.relauncher.Side[]`"
  ([]
    (Side/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.fml.relauncher.Side`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.fml.relauncher.Side [^java.lang.String name]
    (Side/valueOf name)))

(defn server?
  "returns: If this is the server environment - `boolean`"
  (^Boolean [^Side this]
    (-> this (.isServer))))

(defn client?
  "returns: if this is the Client environment - `boolean`"
  (^Boolean [^Side this]
    (-> this (.isClient))))

