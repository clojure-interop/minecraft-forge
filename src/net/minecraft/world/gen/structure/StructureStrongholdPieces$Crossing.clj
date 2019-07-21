(ns net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureStrongholdPieces$Crossing]))

(defn ->crossing
  "Constructor.

  p-i-45580-1 - `int`
  p-i-45580-2 - `java.util.Random`
  p-i-45580-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45580-4 - `net.minecraft.util.EnumFacing`"
  (^StructureStrongholdPieces$Crossing [^Integer p-i-45580-1 ^java.util.Random p-i-45580-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45580-3 ^net.minecraft.util.EnumFacing p-i-45580-4]
    (new StructureStrongholdPieces$Crossing p-i-45580-1 p-i-45580-2 p-i-45580-3 p-i-45580-4))
  (^StructureStrongholdPieces$Crossing []
    (new StructureStrongholdPieces$Crossing )))

(defn *create-piece
  "p-175866-0 - `java.util.List`
  p-175866-1 - `java.util.Random`
  p-175866-2 - `int`
  p-175866-3 - `int`
  p-175866-4 - `int`
  p-175866-5 - `net.minecraft.util.EnumFacing`
  p-175866-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing`"
  (^net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing [^java.util.List p-175866-0 ^java.util.Random p-175866-1 ^Integer p-175866-2 ^Integer p-175866-3 ^Integer p-175866-4 ^net.minecraft.util.EnumFacing p-175866-5 ^Integer p-175866-6]
    (StructureStrongholdPieces$Crossing/createPiece p-175866-0 p-175866-1 p-175866-2 p-175866-3 p-175866-4 p-175866-5 p-175866-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureStrongholdPieces$Crossing this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureStrongholdPieces$Crossing this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

