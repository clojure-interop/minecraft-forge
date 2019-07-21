(ns net.minecraftforge.event.terraingen.InitNoiseGensEvent$Context
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen InitNoiseGensEvent$Context]))

(defn ->context
  "Constructor.

  lperlin-1 - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  lperlin-2 - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  perlin - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  scale - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  depth - `net.minecraft.world.gen.NoiseGeneratorOctaves`"
  (^InitNoiseGensEvent$Context [^net.minecraft.world.gen.NoiseGeneratorOctaves lperlin-1 ^net.minecraft.world.gen.NoiseGeneratorOctaves lperlin-2 ^net.minecraft.world.gen.NoiseGeneratorOctaves perlin ^net.minecraft.world.gen.NoiseGeneratorOctaves scale ^net.minecraft.world.gen.NoiseGeneratorOctaves depth]
    (new InitNoiseGensEvent$Context lperlin-1 lperlin-2 perlin scale depth)))

(defn get-l-perlin-1
  "returns: `net.minecraft.world.gen.NoiseGeneratorOctaves`"
  (^net.minecraft.world.gen.NoiseGeneratorOctaves [^InitNoiseGensEvent$Context this]
    (-> this (.getLPerlin1))))

(defn get-l-perlin-2
  "value - `net.minecraft.world.gen.NoiseGeneratorOctaves`"
  ([^InitNoiseGensEvent$Context this ^net.minecraft.world.gen.NoiseGeneratorOctaves value]
    (-> this (.getLPerlin2 value)))
  (^net.minecraft.world.gen.NoiseGeneratorOctaves [^InitNoiseGensEvent$Context this]
    (-> this (.getLPerlin2))))

(defn get-perlin
  "value - `net.minecraft.world.gen.NoiseGeneratorOctaves`"
  ([^InitNoiseGensEvent$Context this ^net.minecraft.world.gen.NoiseGeneratorOctaves value]
    (-> this (.getPerlin value)))
  (^net.minecraft.world.gen.NoiseGeneratorOctaves [^InitNoiseGensEvent$Context this]
    (-> this (.getPerlin))))

(defn get-scale
  "value - `net.minecraft.world.gen.NoiseGeneratorOctaves`"
  ([^InitNoiseGensEvent$Context this ^net.minecraft.world.gen.NoiseGeneratorOctaves value]
    (-> this (.getScale value)))
  (^net.minecraft.world.gen.NoiseGeneratorOctaves [^InitNoiseGensEvent$Context this]
    (-> this (.getScale))))

(defn get-depth
  "value - `net.minecraft.world.gen.NoiseGeneratorOctaves`"
  ([^InitNoiseGensEvent$Context this ^net.minecraft.world.gen.NoiseGeneratorOctaves value]
    (-> this (.getDepth value)))
  (^net.minecraft.world.gen.NoiseGeneratorOctaves [^InitNoiseGensEvent$Context this]
    (-> this (.getDepth))))

(defn set-l-perlin-1
  "value - `net.minecraft.world.gen.NoiseGeneratorOctaves`"
  ([^InitNoiseGensEvent$Context this ^net.minecraft.world.gen.NoiseGeneratorOctaves value]
    (-> this (.setLPerlin1 value))))

(defn clone
  "returns: `net.minecraftforge.event.terraingen.InitNoiseGensEvent$Context`"
  (^net.minecraftforge.event.terraingen.InitNoiseGensEvent$Context [^InitNoiseGensEvent$Context this]
    (-> this (.clone))))

