(ns net.minecraft.world.storage.MapDecoration$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage MapDecoration$Type]))

(def PLAYER
  "Enum Constant.

  type: net.minecraft.world.storage.MapDecoration$Type"
  MapDecoration$Type/PLAYER)

(def FRAME
  "Enum Constant.

  type: net.minecraft.world.storage.MapDecoration$Type"
  MapDecoration$Type/FRAME)

(def RED_MARKER
  "Enum Constant.

  type: net.minecraft.world.storage.MapDecoration$Type"
  MapDecoration$Type/RED_MARKER)

(def BLUE_MARKER
  "Enum Constant.

  type: net.minecraft.world.storage.MapDecoration$Type"
  MapDecoration$Type/BLUE_MARKER)

(def TARGET_X
  "Enum Constant.

  type: net.minecraft.world.storage.MapDecoration$Type"
  MapDecoration$Type/TARGET_X)

(def TARGET_POINT
  "Enum Constant.

  type: net.minecraft.world.storage.MapDecoration$Type"
  MapDecoration$Type/TARGET_POINT)

(def PLAYER_OFF_MAP
  "Enum Constant.

  type: net.minecraft.world.storage.MapDecoration$Type"
  MapDecoration$Type/PLAYER_OFF_MAP)

(def PLAYER_OFF_LIMITS
  "Enum Constant.

  type: net.minecraft.world.storage.MapDecoration$Type"
  MapDecoration$Type/PLAYER_OFF_LIMITS)

(def MANSION
  "Enum Constant.

  type: net.minecraft.world.storage.MapDecoration$Type"
  MapDecoration$Type/MANSION)

(def MONUMENT
  "Enum Constant.

  type: net.minecraft.world.storage.MapDecoration$Type"
  MapDecoration$Type/MONUMENT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (MapDecoration.Type c : MapDecoration.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.storage.MapDecoration$Type[]`"
  ([]
    (MapDecoration$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.storage.MapDecoration$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.storage.MapDecoration$Type [^java.lang.String name]
    (MapDecoration$Type/valueOf name)))

(defn *by-icon
  "p-191159-0 - `byte`

  returns: `net.minecraft.world.storage.MapDecoration$Type`"
  (^net.minecraft.world.storage.MapDecoration$Type [^Byte p-191159-0]
    (MapDecoration$Type/byIcon p-191159-0)))

(defn get-icon
  "returns: `byte`"
  (^Byte [^MapDecoration$Type this]
    (-> this (.getIcon))))

(defn rendered-on-frame?
  "returns: `boolean`"
  (^Boolean [^MapDecoration$Type this]
    (-> this (.isRenderedOnFrame))))

(defn has-map-color?
  "returns: `boolean`"
  (^Boolean [^MapDecoration$Type this]
    (-> this (.hasMapColor))))

(defn get-map-color
  "returns: `int`"
  (^Integer [^MapDecoration$Type this]
    (-> this (.getMapColor))))

