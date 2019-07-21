(ns net.minecraftforge.event.terraingen.InitNoiseGensEvent$ContextEnd
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen InitNoiseGensEvent$ContextEnd]))

(defn ->context-end
  "Constructor.

  lperlin-1 - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  lperlin-2 - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  perlin - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  scale - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  depth - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  island - `net.minecraft.world.gen.NoiseGeneratorSimplex`"
  (^InitNoiseGensEvent$ContextEnd [^net.minecraft.world.gen.NoiseGeneratorOctaves lperlin-1 ^net.minecraft.world.gen.NoiseGeneratorOctaves lperlin-2 ^net.minecraft.world.gen.NoiseGeneratorOctaves perlin ^net.minecraft.world.gen.NoiseGeneratorOctaves scale ^net.minecraft.world.gen.NoiseGeneratorOctaves depth ^net.minecraft.world.gen.NoiseGeneratorSimplex island]
    (new InitNoiseGensEvent$ContextEnd lperlin-1 lperlin-2 perlin scale depth island)))

(defn clone
  "returns: `net.minecraftforge.event.terraingen.InitNoiseGensEvent$ContextEnd`"
  (^net.minecraftforge.event.terraingen.InitNoiseGensEvent$ContextEnd [^InitNoiseGensEvent$ContextEnd this]
    (-> this (.clone))))

(defn get-island
  "value - `net.minecraft.world.gen.NoiseGeneratorSimplex`"
  ([^InitNoiseGensEvent$ContextEnd this ^net.minecraft.world.gen.NoiseGeneratorSimplex value]
    (-> this (.getIsland value)))
  (^net.minecraft.world.gen.NoiseGeneratorSimplex [^InitNoiseGensEvent$ContextEnd this]
    (-> this (.getIsland))))

