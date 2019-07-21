(ns net.minecraft.world.gen.NoiseGeneratorOctaves
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen NoiseGeneratorOctaves]))

(defn ->noise-generator-octaves
  "Constructor.

  seed - `java.util.Random`
  octaves-in - `int`"
  (^NoiseGeneratorOctaves [^java.util.Random seed ^Integer octaves-in]
    (new NoiseGeneratorOctaves seed octaves-in)))

(defn generate-noise-octaves
  "noise-array - `double[]`
  x-offset - `int`
  y-offset - `int`
  z-offset - `int`
  x-size - `int`
  y-size - `int`
  z-size - `int`
  x-scale - `double`
  y-scale - `double`
  z-scale - `double`

  returns: `double[]`"
  ([^NoiseGeneratorOctaves this noise-array ^Integer x-offset ^Integer y-offset ^Integer z-offset ^Integer x-size ^Integer y-size ^Integer z-size ^Double x-scale ^Double y-scale ^Double z-scale]
    (-> this (.generateNoiseOctaves noise-array x-offset y-offset z-offset x-size y-size z-size x-scale y-scale z-scale)))
  ([^NoiseGeneratorOctaves this noise-array ^Integer x-offset ^Integer z-offset ^Integer x-size ^Integer z-size ^Double x-scale ^Double z-scale ^Double p-76305-10]
    (-> this (.generateNoiseOctaves noise-array x-offset z-offset x-size z-size x-scale z-scale p-76305-10))))

