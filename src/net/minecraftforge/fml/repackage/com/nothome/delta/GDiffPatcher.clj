(ns net.minecraftforge.fml.repackage.com.nothome.delta.GDiffPatcher
  "This class patches an input file with a GDIFF patch file.

  The patch file follows the GDIFF file specification available at

  http://www.w3.org/TR/NOTE-gdiff-19970901.html."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.repackage.com.nothome.delta GDiffPatcher]))

(defn ->g-diff-patcher
  "Constructor.

  Constructs a new GDiffPatcher."
  (^GDiffPatcher []
    (new GDiffPatcher )))

(defn *main
  "Simple command line tool to patch a file.

  argv - `java.lang.String[]`"
  ([argv]
    (GDiffPatcher/main argv)))

(defn patch
  "Patches to an output file.

  source-file - `java.io.File`
  patch-file - `java.io.File`
  output-file - `java.io.File`

  throws: java.io.IOException"
  ([^GDiffPatcher this ^java.io.File source-file ^java.io.File patch-file ^java.io.File output-file]
    (-> this (.patch source-file patch-file output-file)))
  ([^GDiffPatcher this source patch]
    (-> this (.patch source patch))))

