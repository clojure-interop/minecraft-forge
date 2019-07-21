(ns net.minecraft.world.gen.NoiseGeneratorSimplex
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen NoiseGeneratorSimplex]))

(defn ->noise-generator-simplex
  "Constructor.

  p-i-45471-1 - `java.util.Random`"
  (^NoiseGeneratorSimplex [^java.util.Random p-i-45471-1]
    (new NoiseGeneratorSimplex p-i-45471-1))
  (^NoiseGeneratorSimplex []
    (new NoiseGeneratorSimplex )))

(def *-sqrt-3
  "Static Constant.

  type: double"
  NoiseGeneratorSimplex/SQRT_3)

(defn xo
  "Instance Field.

  type: double"
  (^Double [^NoiseGeneratorSimplex this]
    (-> this .-xo)))

(defn yo
  "Instance Field.

  type: double"
  (^Double [^NoiseGeneratorSimplex this]
    (-> this .-yo)))

(defn zo
  "Instance Field.

  type: double"
  (^Double [^NoiseGeneratorSimplex this]
    (-> this .-zo)))

(defn get-value
  "p-151605-1 - `double`
  p-151605-3 - `double`

  returns: `double`"
  (^Double [^NoiseGeneratorSimplex this ^Double p-151605-1 ^Double p-151605-3]
    (-> this (.getValue p-151605-1 p-151605-3))))

(defn add
  "p-151606-1 - `double[]`
  p-151606-2 - `double`
  p-151606-4 - `double`
  p-151606-6 - `int`
  p-151606-7 - `int`
  p-151606-8 - `double`
  p-151606-10 - `double`
  p-151606-12 - `double`"
  ([^NoiseGeneratorSimplex this p-151606-1 ^Double p-151606-2 ^Double p-151606-4 ^Integer p-151606-6 ^Integer p-151606-7 ^Double p-151606-8 ^Double p-151606-10 ^Double p-151606-12]
    (-> this (.add p-151606-1 p-151606-2 p-151606-4 p-151606-6 p-151606-7 p-151606-8 p-151606-10 p-151606-12))))

