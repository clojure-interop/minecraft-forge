(ns net.minecraftforge.event.terraingen.InitNoiseGensEvent$ContextHell
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen InitNoiseGensEvent$ContextHell]))

(defn ->context-hell
  "Constructor.

  lperlin-1 - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  lperlin-2 - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  perlin - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  perlin-2 - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  perlin-3 - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  scale - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  depth - `net.minecraft.world.gen.NoiseGeneratorOctaves`"
  (^InitNoiseGensEvent$ContextHell [^net.minecraft.world.gen.NoiseGeneratorOctaves lperlin-1 ^net.minecraft.world.gen.NoiseGeneratorOctaves lperlin-2 ^net.minecraft.world.gen.NoiseGeneratorOctaves perlin ^net.minecraft.world.gen.NoiseGeneratorOctaves perlin-2 ^net.minecraft.world.gen.NoiseGeneratorOctaves perlin-3 ^net.minecraft.world.gen.NoiseGeneratorOctaves scale ^net.minecraft.world.gen.NoiseGeneratorOctaves depth]
    (new InitNoiseGensEvent$ContextHell lperlin-1 lperlin-2 perlin perlin-2 perlin-3 scale depth)))

(defn clone
  "returns: `net.minecraftforge.event.terraingen.InitNoiseGensEvent$ContextHell`"
  (^net.minecraftforge.event.terraingen.InitNoiseGensEvent$ContextHell [^InitNoiseGensEvent$ContextHell this]
    (-> this (.clone))))

(defn get-perlin-2
  "value - `net.minecraft.world.gen.NoiseGeneratorOctaves`"
  ([^InitNoiseGensEvent$ContextHell this ^net.minecraft.world.gen.NoiseGeneratorOctaves value]
    (-> this (.getPerlin2 value)))
  (^net.minecraft.world.gen.NoiseGeneratorOctaves [^InitNoiseGensEvent$ContextHell this]
    (-> this (.getPerlin2))))

(defn get-perlin-3
  "value - `net.minecraft.world.gen.NoiseGeneratorOctaves`"
  ([^InitNoiseGensEvent$ContextHell this ^net.minecraft.world.gen.NoiseGeneratorOctaves value]
    (-> this (.getPerlin3 value)))
  (^net.minecraft.world.gen.NoiseGeneratorOctaves [^InitNoiseGensEvent$ContextHell this]
    (-> this (.getPerlin3))))

