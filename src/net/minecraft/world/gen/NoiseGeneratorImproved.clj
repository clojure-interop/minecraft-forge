(ns net.minecraft.world.gen.NoiseGeneratorImproved
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen NoiseGeneratorImproved]))

(defn ->noise-generator-improved
  "Constructor.

  p-i-45469-1 - `java.util.Random`"
  (^NoiseGeneratorImproved [^java.util.Random p-i-45469-1]
    (new NoiseGeneratorImproved p-i-45469-1))
  (^NoiseGeneratorImproved []
    (new NoiseGeneratorImproved )))

(defn x-coord
  "Instance Field.

  type: double"
  (^Double [^NoiseGeneratorImproved this]
    (-> this .-xCoord)))

(defn y-coord
  "Instance Field.

  type: double"
  (^Double [^NoiseGeneratorImproved this]
    (-> this .-yCoord)))

(defn z-coord
  "Instance Field.

  type: double"
  (^Double [^NoiseGeneratorImproved this]
    (-> this .-zCoord)))

(defn lerp
  "p-76311-1 - `double`
  p-76311-3 - `double`
  p-76311-5 - `double`

  returns: `double`"
  (^Double [^NoiseGeneratorImproved this ^Double p-76311-1 ^Double p-76311-3 ^Double p-76311-5]
    (-> this (.lerp p-76311-1 p-76311-3 p-76311-5))))

(defn grad-2
  "p-76309-1 - `int`
  p-76309-2 - `double`
  p-76309-4 - `double`

  returns: `double`"
  (^Double [^NoiseGeneratorImproved this ^Integer p-76309-1 ^Double p-76309-2 ^Double p-76309-4]
    (-> this (.grad2 p-76309-1 p-76309-2 p-76309-4))))

(defn grad
  "p-76310-1 - `int`
  p-76310-2 - `double`
  p-76310-4 - `double`
  p-76310-6 - `double`

  returns: `double`"
  (^Double [^NoiseGeneratorImproved this ^Integer p-76310-1 ^Double p-76310-2 ^Double p-76310-4 ^Double p-76310-6]
    (-> this (.grad p-76310-1 p-76310-2 p-76310-4 p-76310-6))))

(defn populate-noise-array
  "noise-array - `double[]`
  x-offset - `double`
  y-offset - `double`
  z-offset - `double`
  x-size - `int`
  y-size - `int`
  z-size - `int`
  x-scale - `double`
  y-scale - `double`
  z-scale - `double`
  noise-scale - `double`"
  ([^NoiseGeneratorImproved this noise-array ^Double x-offset ^Double y-offset ^Double z-offset ^Integer x-size ^Integer y-size ^Integer z-size ^Double x-scale ^Double y-scale ^Double z-scale ^Double noise-scale]
    (-> this (.populateNoiseArray noise-array x-offset y-offset z-offset x-size y-size z-size x-scale y-scale z-scale noise-scale))))

