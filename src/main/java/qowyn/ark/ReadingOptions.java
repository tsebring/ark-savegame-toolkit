package qowyn.ark;

import java.util.function.Predicate;

/**
 * Options specific to read operations
 * 
 * @author Roland Firmont
 */
public class ReadingOptions extends BaseOptions {

  private boolean dataFiles = true;

  private boolean embeddedData = true;

  private boolean gameObjects = true;

  private boolean gameObjectProperties = true;

  private Predicate<GameObject> objectFilter = null;

  public static ReadingOptions create() {
    return new ReadingOptions();
  }

  /**
   * Determines which objects properties will be loaded. {@link #getGameObjects()} needs to be
   * <tt>true</tt> for this to have any effect.
   * 
   * @return the filter
   */
  public Predicate<GameObject> getObjectFilter() {
    return objectFilter;
  }

  /**
   * Sets a filter on which objects properties will be loaded. {@link #getGameObjects()} needs to be
   * <tt>true</tt> for this to have any effect.
   * 
   * @param objectFilter the filter
   * @return self, to continue building options using a fluent interface
   */
  public ReadingOptions withObjectFilter(Predicate<GameObject> objectFilter) {
    this.objectFilter = objectFilter;
    return this;
  }

  /**
   * Whether the names of data files will be read or skipped over.
   * 
   * @return <tt>true</tt> if reading, <tt>false</tt> if skipping
   */
  public boolean getDataFiles() {
    return dataFiles;
  }

  /**
   * Sets whether the names of data files will be read or skipped over.
   * 
   * @param dataFiles <tt>true</tt> if reading, <tt>false</tt> if skipping
   * @return self, to continue building options using a fluent interface
   */
  public ReadingOptions withDataFiles(boolean dataFiles) {
    this.dataFiles = dataFiles;
    return this;
  }

  /**
   * Whether embedded binary data will be read or skipped over.
   * 
   * @return <tt>true</tt> if reading, <tt>false</tt> if skipping
   */
  public boolean getEmbeddedData() {
    return embeddedData;
  }

  /**
   * Sets whether embedded binary data will be read or skipped over.
   * 
   * @param embeddedData <tt>true</tt> if reading, <tt>false</tt> if skipping
   * @return self, to continue building options using a fluent interface
   */
  public ReadingOptions withEmbeddedData(boolean embeddedData) {
    this.embeddedData = embeddedData;
    return this;
  }

  /**
   * Whether game objects will be read or skipped over.
   * 
   * @return <tt>true</tt> if reading, <tt>false</tt> if skipping
   */
  public boolean getGameObjects() {
    return gameObjects;
  }

  /**
   * Sets whether game objects will be read or skipped over.
   * 
   * @param gameObjects <tt>true</tt> if reading, <tt>false</tt> if skipping
   * @return self, to continue building options using a fluent interface
   */
  public ReadingOptions withGameObjects(boolean gameObjects) {
    this.gameObjects = gameObjects;
    return this;
  }

  /**
   * Whether {@link GameObject} properties will be read or skipped over. {@link #getGameObjects()}
   * needs to be <tt>true</tt> for this to have any effect.
   * 
   * @see #withObjectFilter(Predicate)
   * @return <tt>true</tt> if reading, <tt>false</tt> if skipping
   */
  public boolean getGameObjectProperties() {
    return gameObjectProperties;
  }

  /**
   * Sets whether {@link GameObject} properties will be read or skipped over.
   * {@link #getGameObjects()} needs to be <tt>true</tt> for this to have any effect.
   * 
   * @see #withObjectFilter(Predicate)
   * @param gameObjectProperties <tt>true</tt> if reading, <tt>false</tt> if skipping
   * @return self, to continue building options using a fluent interface
   */
  public ReadingOptions withGameObjectProperties(boolean gameObjectProperties) {
    this.gameObjectProperties = gameObjectProperties;
    return this;
  }

  @Override
  public ReadingOptions parallel(boolean parallel) {
    super.parallel(parallel);
    return this;
  }

  @Override
  public ReadingOptions withMemoryMapping(boolean memoryMapping) {
    super.withMemoryMapping(memoryMapping);
    return this;
  }

  @Override
  public ReadingOptions asynchronous(boolean asynchronous) {
    super.asynchronous(asynchronous);
    return this;
  }

}
