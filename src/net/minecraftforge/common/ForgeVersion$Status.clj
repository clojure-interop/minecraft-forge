(ns net.minecraftforge.common.ForgeVersion$Status
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common ForgeVersion$Status]))

(def PENDING
  "Enum Constant.

  type: net.minecraftforge.common.ForgeVersion$Status"
  ForgeVersion$Status/PENDING)

(def FAILED
  "Enum Constant.

  type: net.minecraftforge.common.ForgeVersion$Status"
  ForgeVersion$Status/FAILED)

(def UP_TO_DATE
  "Enum Constant.

  type: net.minecraftforge.common.ForgeVersion$Status"
  ForgeVersion$Status/UP_TO_DATE)

(def OUTDATED
  "Enum Constant.

  type: net.minecraftforge.common.ForgeVersion$Status"
  ForgeVersion$Status/OUTDATED)

(def AHEAD
  "Enum Constant.

  type: net.minecraftforge.common.ForgeVersion$Status"
  ForgeVersion$Status/AHEAD)

(def BETA
  "Enum Constant.

  type: net.minecraftforge.common.ForgeVersion$Status"
  ForgeVersion$Status/BETA)

(def BETA_OUTDATED
  "Enum Constant.

  type: net.minecraftforge.common.ForgeVersion$Status"
  ForgeVersion$Status/BETA_OUTDATED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ForgeVersion.Status c : ForgeVersion.Status.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.common.ForgeVersion$Status[]`"
  ([]
    (ForgeVersion$Status/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.common.ForgeVersion$Status`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.common.ForgeVersion$Status [^java.lang.String name]
    (ForgeVersion$Status/valueOf name)))

(defn get-sheet-offset
  "returns: `int`"
  (^Integer [^ForgeVersion$Status this]
    (-> this (.getSheetOffset))))

(defn should-draw?
  "returns: `boolean`"
  (^Boolean [^ForgeVersion$Status this]
    (-> this (.shouldDraw))))

(defn animated?
  "returns: `boolean`"
  (^Boolean [^ForgeVersion$Status this]
    (-> this (.isAnimated))))

