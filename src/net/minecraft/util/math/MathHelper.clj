(ns net.minecraft.util.math.MathHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.math MathHelper]))

(defn ->math-helper
  "Constructor."
  (^MathHelper []
    (new MathHelper )))

(def *-sqrt-2
  "Static Constant.

  type: float"
  MathHelper/SQRT_2)

(defn *frac
  "number - `double`

  returns: `double`"
  (^Double [^Double number]
    (MathHelper/frac number)))

(defn *round-up
  "number - `int`
  interval - `int`

  returns: `int`"
  (^Integer [^Integer number ^Integer interval]
    (MathHelper/roundUp number interval)))

(defn *floor
  "value - `float`

  returns: `int`"
  (^Integer [^Float value]
    (MathHelper/floor value)))

(defn *get-random-uuid
  "rand - `java.util.Random`

  returns: `java.util.UUID`"
  (^java.util.UUID [^java.util.Random rand]
    (MathHelper/getRandomUUID rand))
  (^java.util.UUID []
    (MathHelper/getRandomUUID )))

(defn *ceil
  "value - `float`

  returns: `int`"
  (^Integer [^Float value]
    (MathHelper/ceil value)))

(defn *fast-inv-sqrt
  "p-181161-0 - `double`

  returns: `double`"
  (^Double [^Double p-181161-0]
    (MathHelper/fastInvSqrt p-181161-0)))

(defn *clamp-angle
  "angle - `int`

  returns: `int`"
  (^Integer [^Integer angle]
    (MathHelper/clampAngle angle)))

(defn *epsilon-equals
  "p-180185-0 - `float`
  p-180185-1 - `float`

  returns: `boolean`"
  (^Boolean [^Float p-180185-0 ^Float p-180185-1]
    (MathHelper/epsilonEquals p-180185-0 p-180185-1)))

(defn *hsv-to-rgb
  "hue - `float`
  saturation - `float`
  value - `float`

  returns: `int`"
  (^Integer [^Float hue ^Float saturation ^Float value]
    (MathHelper/hsvToRGB hue saturation value)))

(defn *lfloor
  "value - `double`

  returns: `long`"
  (^Long [^Double value]
    (MathHelper/lfloor value)))

(defn *rgb
  "r-in - `float`
  g-in - `float`
  b-in - `float`

  returns: `int`"
  (^Integer [^Float r-in ^Float g-in ^Float b-in]
    (MathHelper/rgb r-in g-in b-in)))

(defn *average
  "values - `long[]`

  returns: `double`"
  (^Double [values]
    (MathHelper/average values)))

(defn *atan-2
  "p-181159-0 - `double`
  p-181159-2 - `double`

  returns: `double`"
  (^Double [^Double p-181159-0 ^Double p-181159-2]
    (MathHelper/atan2 p-181159-0 p-181159-2)))

(defn *hash
  "p-188208-0 - `int`

  returns: `int`"
  (^Integer [^Integer p-188208-0]
    (MathHelper/hash p-188208-0)))

(defn *next-float
  "random - `java.util.Random`
  minimum - `float`
  maximum - `float`

  returns: `float`"
  (^Float [^java.util.Random random ^Float minimum ^Float maximum]
    (MathHelper/nextFloat random minimum maximum)))

(defn *get-position-random
  "pos - `net.minecraft.util.math.Vec3i`

  returns: `long`"
  (^Long [^net.minecraft.util.math.Vec3i pos]
    (MathHelper/getPositionRandom pos)))

(defn *get-coordinate-random
  "x - `int`
  y - `int`
  z - `int`

  returns: `long`"
  (^Long [^Integer x ^Integer y ^Integer z]
    (MathHelper/getCoordinateRandom x y z)))

(defn *sin
  "value - `float`

  returns: `float`"
  (^Float [^Float value]
    (MathHelper/sin value)))

(defn *abs-floor
  "value - `double`

  returns: `int`"
  (^Integer [^Double value]
    (MathHelper/absFloor value)))

(defn *get-int
  "random - `java.util.Random`
  minimum - `int`
  maximum - `int`

  returns: `int`"
  (^Integer [^java.util.Random random ^Integer minimum ^Integer maximum]
    (MathHelper/getInt random minimum maximum))
  (^Integer [^java.lang.String value ^Integer default-value]
    (MathHelper/getInt value default-value)))

(defn *clamp
  "num - `int`
  min - `int`
  max - `int`

  returns: `int`"
  (^Integer [^Integer num ^Integer min ^Integer max]
    (MathHelper/clamp num min max)))

(defn *sqrt
  "value - `float`

  returns: `float`"
  (^Float [^Float value]
    (MathHelper/sqrt value)))

(defn *cos
  "value - `float`

  returns: `float`"
  (^Float [^Float value]
    (MathHelper/cos value)))

(defn *normalize-angle
  "p-180184-0 - `int`
  p-180184-1 - `int`

  returns: `int`"
  (^Integer [^Integer p-180184-0 ^Integer p-180184-1]
    (MathHelper/normalizeAngle p-180184-0 p-180184-1)))

(defn *positive-modulo
  "numerator - `float`
  denominator - `float`

  returns: `float`"
  (^Float [^Float numerator ^Float denominator]
    (MathHelper/positiveModulo numerator denominator)))

(defn *fast-floor
  "value - `double`

  returns: `int`"
  (^Integer [^Double value]
    (MathHelper/fastFloor value)))

(defn *abs
  "value - `float`

  returns: `float`"
  (^Float [^Float value]
    (MathHelper/abs value)))

(defn *log-2-de-bruijn
  "value - `int`

  returns: `int`"
  (^Integer [^Integer value]
    (MathHelper/log2DeBruijn value)))

(defn *multiply-color
  "p-180188-0 - `int`
  p-180188-1 - `int`

  returns: `int`"
  (^Integer [^Integer p-180188-0 ^Integer p-180188-1]
    (MathHelper/multiplyColor p-180188-0 p-180188-1)))

(defn *clamped-lerp
  "lower-bnd - `double`
  upper-bnd - `double`
  slide - `double`

  returns: `double`"
  (^Double [^Double lower-bnd ^Double upper-bnd ^Double slide]
    (MathHelper/clampedLerp lower-bnd upper-bnd slide)))

(defn *abs-max
  "p-76132-0 - `double`
  p-76132-2 - `double`

  returns: `double`"
  (^Double [^Double p-76132-0 ^Double p-76132-2]
    (MathHelper/absMax p-76132-0 p-76132-2)))

(defn *pct
  "p-181160-0 - `double`
  p-181160-2 - `double`
  p-181160-4 - `double`

  returns: `double`"
  (^Double [^Double p-181160-0 ^Double p-181160-2 ^Double p-181160-4]
    (MathHelper/pct p-181160-0 p-181160-2 p-181160-4)))

(defn *wrap-degrees
  "value - `float`

  returns: `float`"
  (^Float [^Float value]
    (MathHelper/wrapDegrees value)))

(defn *int-floor-div
  "p-76137-0 - `int`
  p-76137-1 - `int`

  returns: `int`"
  (^Integer [^Integer p-76137-0 ^Integer p-76137-1]
    (MathHelper/intFloorDiv p-76137-0 p-76137-1)))

(defn *next-double
  "random - `java.util.Random`
  minimum - `double`
  maximum - `double`

  returns: `double`"
  (^Double [^java.util.Random random ^Double minimum ^Double maximum]
    (MathHelper/nextDouble random minimum maximum)))

(defn *smallest-encompassing-power-of-two
  "value - `int`

  returns: `int`"
  (^Integer [^Integer value]
    (MathHelper/smallestEncompassingPowerOfTwo value)))

(defn *get-double
  "value - `java.lang.String`
  default-value - `double`
  max - `double`

  returns: `double`"
  (^Double [^java.lang.String value ^Double default-value ^Double max]
    (MathHelper/getDouble value default-value max))
  (^Double [^java.lang.String value ^Double default-value]
    (MathHelper/getDouble value default-value)))

(defn *log-2
  "value - `int`

  returns: `int`"
  (^Integer [^Integer value]
    (MathHelper/log2 value)))

