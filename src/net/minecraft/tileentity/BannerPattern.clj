(ns net.minecraft.tileentity.BannerPattern
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity BannerPattern]))

(def BASE
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/BASE)

(def SQUARE_BOTTOM_LEFT
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/SQUARE_BOTTOM_LEFT)

(def SQUARE_BOTTOM_RIGHT
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/SQUARE_BOTTOM_RIGHT)

(def SQUARE_TOP_LEFT
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/SQUARE_TOP_LEFT)

(def SQUARE_TOP_RIGHT
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/SQUARE_TOP_RIGHT)

(def STRIPE_BOTTOM
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/STRIPE_BOTTOM)

(def STRIPE_TOP
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/STRIPE_TOP)

(def STRIPE_LEFT
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/STRIPE_LEFT)

(def STRIPE_RIGHT
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/STRIPE_RIGHT)

(def STRIPE_CENTER
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/STRIPE_CENTER)

(def STRIPE_MIDDLE
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/STRIPE_MIDDLE)

(def STRIPE_DOWNRIGHT
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/STRIPE_DOWNRIGHT)

(def STRIPE_DOWNLEFT
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/STRIPE_DOWNLEFT)

(def STRIPE_SMALL
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/STRIPE_SMALL)

(def CROSS
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/CROSS)

(def STRAIGHT_CROSS
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/STRAIGHT_CROSS)

(def TRIANGLE_BOTTOM
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/TRIANGLE_BOTTOM)

(def TRIANGLE_TOP
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/TRIANGLE_TOP)

(def TRIANGLES_BOTTOM
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/TRIANGLES_BOTTOM)

(def TRIANGLES_TOP
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/TRIANGLES_TOP)

(def DIAGONAL_LEFT
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/DIAGONAL_LEFT)

(def DIAGONAL_RIGHT
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/DIAGONAL_RIGHT)

(def DIAGONAL_LEFT_MIRROR
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/DIAGONAL_LEFT_MIRROR)

(def DIAGONAL_RIGHT_MIRROR
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/DIAGONAL_RIGHT_MIRROR)

(def CIRCLE_MIDDLE
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/CIRCLE_MIDDLE)

(def RHOMBUS_MIDDLE
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/RHOMBUS_MIDDLE)

(def HALF_VERTICAL
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/HALF_VERTICAL)

(def HALF_HORIZONTAL
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/HALF_HORIZONTAL)

(def HALF_VERTICAL_MIRROR
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/HALF_VERTICAL_MIRROR)

(def HALF_HORIZONTAL_MIRROR
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/HALF_HORIZONTAL_MIRROR)

(def BORDER
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/BORDER)

(def CURLY_BORDER
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/CURLY_BORDER)

(def CREEPER
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/CREEPER)

(def GRADIENT
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/GRADIENT)

(def GRADIENT_UP
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/GRADIENT_UP)

(def BRICKS
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/BRICKS)

(def SKULL
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/SKULL)

(def FLOWER
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/FLOWER)

(def MOJANG
  "Enum Constant.

  type: net.minecraft.tileentity.BannerPattern"
  BannerPattern/MOJANG)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BannerPattern c : BannerPattern.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.tileentity.BannerPattern[]`"
  ([]
    (BannerPattern/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.tileentity.BannerPattern`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.tileentity.BannerPattern [^java.lang.String name]
    (BannerPattern/valueOf name)))

(defn *by-hash
  "hash - `java.lang.String`

  returns: `net.minecraft.tileentity.BannerPattern`"
  (^net.minecraft.tileentity.BannerPattern [^java.lang.String hash]
    (BannerPattern/byHash hash)))

(defn get-file-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BannerPattern this]
    (-> this (.getFileName))))

(defn get-hashname
  "returns: `java.lang.String`"
  (^java.lang.String [^BannerPattern this]
    (-> this (.getHashname))))

(defn get-patterns
  "returns: `java.lang.String[]`"
  ([^BannerPattern this]
    (-> this (.getPatterns))))

(defn has-pattern?
  "returns: `boolean`"
  (^Boolean [^BannerPattern this]
    (-> this (.hasPattern))))

(defn has-pattern-item?
  "returns: `boolean`"
  (^Boolean [^BannerPattern this]
    (-> this (.hasPatternItem))))

(defn get-pattern-item
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^BannerPattern this]
    (-> this (.getPatternItem))))

