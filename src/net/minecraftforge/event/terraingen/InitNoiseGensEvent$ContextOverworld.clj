(ns net.minecraftforge.event.terraingen.InitNoiseGensEvent$ContextOverworld
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen InitNoiseGensEvent$ContextOverworld]))

(defn ->context-overworld
  "Constructor.

  lperlin-1 - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  lperlin-2 - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  perlin - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  height - `net.minecraft.world.gen.NoiseGeneratorPerlin`
  scale - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  depth - `net.minecraft.world.gen.NoiseGeneratorOctaves`
  forest - `net.minecraft.world.gen.NoiseGeneratorOctaves`"
  (^InitNoiseGensEvent$ContextOverworld [^net.minecraft.world.gen.NoiseGeneratorOctaves lperlin-1 ^net.minecraft.world.gen.NoiseGeneratorOctaves lperlin-2 ^net.minecraft.world.gen.NoiseGeneratorOctaves perlin ^net.minecraft.world.gen.NoiseGeneratorPerlin height ^net.minecraft.world.gen.NoiseGeneratorOctaves scale ^net.minecraft.world.gen.NoiseGeneratorOctaves depth ^net.minecraft.world.gen.NoiseGeneratorOctaves forest]
    (new InitNoiseGensEvent$ContextOverworld lperlin-1 lperlin-2 perlin height scale depth forest)))

(defn clone
  "returns: `net.minecraftforge.event.terraingen.InitNoiseGensEvent$ContextOverworld`"
  (^net.minecraftforge.event.terraingen.InitNoiseGensEvent$ContextOverworld [^InitNoiseGensEvent$ContextOverworld this]
    (-> this (.clone))))

(defn get-height
  "value - `net.minecraft.world.gen.NoiseGeneratorPerlin`"
  ([^InitNoiseGensEvent$ContextOverworld this ^net.minecraft.world.gen.NoiseGeneratorPerlin value]
    (-> this (.getHeight value)))
  (^net.minecraft.world.gen.NoiseGeneratorPerlin [^InitNoiseGensEvent$ContextOverworld this]
    (-> this (.getHeight))))

(defn get-forest
  "value - `net.minecraft.world.gen.NoiseGeneratorOctaves`"
  ([^InitNoiseGensEvent$ContextOverworld this ^net.minecraft.world.gen.NoiseGeneratorOctaves value]
    (-> this (.getForest value)))
  (^net.minecraft.world.gen.NoiseGeneratorOctaves [^InitNoiseGensEvent$ContextOverworld this]
    (-> this (.getForest))))

