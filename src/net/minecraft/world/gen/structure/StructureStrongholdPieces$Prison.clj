(ns net.minecraft.world.gen.structure.StructureStrongholdPieces$Prison
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureStrongholdPieces$Prison]))

(defn ->prison
  "Constructor.

  p-i-45576-1 - `int`
  p-i-45576-2 - `java.util.Random`
  p-i-45576-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45576-4 - `net.minecraft.util.EnumFacing`"
  (^StructureStrongholdPieces$Prison [^Integer p-i-45576-1 ^java.util.Random p-i-45576-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45576-3 ^net.minecraft.util.EnumFacing p-i-45576-4]
    (new StructureStrongholdPieces$Prison p-i-45576-1 p-i-45576-2 p-i-45576-3 p-i-45576-4))
  (^StructureStrongholdPieces$Prison []
    (new StructureStrongholdPieces$Prison )))

(defn *create-piece
  "p-175860-0 - `java.util.List`
  p-175860-1 - `java.util.Random`
  p-175860-2 - `int`
  p-175860-3 - `int`
  p-175860-4 - `int`
  p-175860-5 - `net.minecraft.util.EnumFacing`
  p-175860-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureStrongholdPieces$Prison`"
  (^net.minecraft.world.gen.structure.StructureStrongholdPieces$Prison [^java.util.List p-175860-0 ^java.util.Random p-175860-1 ^Integer p-175860-2 ^Integer p-175860-3 ^Integer p-175860-4 ^net.minecraft.util.EnumFacing p-175860-5 ^Integer p-175860-6]
    (StructureStrongholdPieces$Prison/createPiece p-175860-0 p-175860-1 p-175860-2 p-175860-3 p-175860-4 p-175860-5 p-175860-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureStrongholdPieces$Prison this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureStrongholdPieces$Prison this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

