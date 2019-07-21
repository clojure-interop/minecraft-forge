(ns net.minecraft.world.gen.NoiseGeneratorPerlin
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen NoiseGeneratorPerlin]))

(defn ->noise-generator-perlin
  "Constructor.

  p-i-45470-1 - `java.util.Random`
  p-i-45470-2 - `int`"
  (^NoiseGeneratorPerlin [^java.util.Random p-i-45470-1 ^Integer p-i-45470-2]
    (new NoiseGeneratorPerlin p-i-45470-1 p-i-45470-2)))

(defn get-value
  "p-151601-1 - `double`
  p-151601-3 - `double`

  returns: `double`"
  (^Double [^NoiseGeneratorPerlin this ^Double p-151601-1 ^Double p-151601-3]
    (-> this (.getValue p-151601-1 p-151601-3))))

(defn get-region
  "p-151600-1 - `double[]`
  p-151600-2 - `double`
  p-151600-4 - `double`
  p-151600-6 - `int`
  p-151600-7 - `int`
  p-151600-8 - `double`
  p-151600-10 - `double`
  p-151600-12 - `double`
  p-151600-14 - `double`

  returns: `double[]`"
  ([^NoiseGeneratorPerlin this p-151600-1 ^Double p-151600-2 ^Double p-151600-4 ^Integer p-151600-6 ^Integer p-151600-7 ^Double p-151600-8 ^Double p-151600-10 ^Double p-151600-12 ^Double p-151600-14]
    (-> this (.getRegion p-151600-1 p-151600-2 p-151600-4 p-151600-6 p-151600-7 p-151600-8 p-151600-10 p-151600-12 p-151600-14)))
  ([^NoiseGeneratorPerlin this p-151599-1 ^Double p-151599-2 ^Double p-151599-4 ^Integer p-151599-6 ^Integer p-151599-7 ^Double p-151599-8 ^Double p-151599-10 ^Double p-151599-12]
    (-> this (.getRegion p-151599-1 p-151599-2 p-151599-4 p-151599-6 p-151599-7 p-151599-8 p-151599-10 p-151599-12))))

