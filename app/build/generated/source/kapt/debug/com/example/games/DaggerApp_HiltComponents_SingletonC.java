// Generated by Dagger (https://dagger.dev).
package com.example.games;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.example.core.di.GamesModule;
import com.example.core.di.GamesModule_ProvideMoviesApiFactory;
import com.example.core.di.GamesModule_ProvideMoviesRepositoryFactory;
import com.example.core.di.GamesModule_ProvideOkhttpClientFactory;
import com.example.core.di.GamesModule_ProvideTrackerDatabaseFactory;
import com.example.core.di.UseCaseModule_ProvideTrackerUseCasesFactory;
import com.example.core.local.GamesDatabase;
import com.example.core.network.service.ApiServices;
import com.example.core.repository.GamesRepository;
import com.example.core.use_case.GamesUseCase;
import com.example.games.detail.ui.DetailActivity;
import com.example.games.detail.viewmodel.DetailViewModel;
import com.example.games.detail.viewmodel.DetailViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.games.favorite.ui.FavoriteFragment;
import com.example.games.favorite.viewmodel.FavoriteViewModel;
import com.example.games.favorite.viewmodel.FavoriteViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.games.home.ui.HomeFragment;
import com.example.games.home.viewmodel.HomeViewModel;
import com.example.games.home.viewmodel.HomeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.games.main.ui.MainActivity;
import com.example.games.search.ui.SearchActivity;
import com.example.games.search.viewmodel.SearchViewModel;
import com.example.games.search.viewmodel.SearchViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerApp_HiltComponents_SingletonC extends App_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final DaggerApp_HiltComponents_SingletonC singletonC = this;

  private Provider<OkHttpClient> provideOkhttpClientProvider;

  private Provider<ApiServices> provideMoviesApiProvider;

  private Provider<GamesDatabase> provideTrackerDatabaseProvider;

  private Provider<GamesRepository> provideMoviesRepositoryProvider;

  private DaggerApp_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    initialize(applicationContextModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  private ApiServices apiServices() {
    return GamesModule_ProvideMoviesApiFactory.provideMoviesApi(provideOkhttpClientProvider.get());
  }

  private GamesDatabase gamesDatabase() {
    return GamesModule_ProvideTrackerDatabaseFactory.provideTrackerDatabase(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
  }

  private GamesRepository gamesRepository() {
    return GamesModule_ProvideMoviesRepositoryFactory.provideMoviesRepository(provideMoviesApiProvider.get(), provideTrackerDatabaseProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ApplicationContextModule applicationContextModuleParam) {
    this.provideOkhttpClientProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonC, 2));
    this.provideMoviesApiProvider = DoubleCheck.provider(new SwitchingProvider<ApiServices>(singletonC, 1));
    this.provideTrackerDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<GamesDatabase>(singletonC, 3));
    this.provideMoviesRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<GamesRepository>(singletonC, 0));
  }

  @Override
  public void injectApp(App app) {
  }

  @Override
  public Set<Boolean> getDisableFragmentGetContextFix() {
    return Collections.<Boolean>emptySet();
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder(singletonC);
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder(singletonC);
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder gamesModule(GamesModule gamesModule) {
      Preconditions.checkNotNull(gamesModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    public App_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerApp_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements App_HiltComponents.ActivityRetainedC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private ActivityRetainedCBuilder(DaggerApp_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public App_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonC);
    }
  }

  private static final class ActivityCBuilder implements App_HiltComponents.ActivityC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public App_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonC, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements App_HiltComponents.FragmentC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public App_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements App_HiltComponents.ViewWithFragmentC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements App_HiltComponents.ViewC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonC, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements App_HiltComponents.ViewModelC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public App_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonC, activityRetainedCImpl, savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements App_HiltComponents.ServiceC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private Service service;

    private ServiceCBuilder(DaggerApp_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public App_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonC, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends App_HiltComponents.ViewWithFragmentC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends App_HiltComponents.FragmentC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void injectFavoriteFragment(FavoriteFragment favoriteFragment) {
    }

    @Override
    public void injectHomeFragment(HomeFragment homeFragment) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends App_HiltComponents.ViewC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends App_HiltComponents.ActivityC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectDetailActivity(DetailActivity detailActivity) {
    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }

    @Override
    public void injectSearchActivity(SearchActivity searchActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonC, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(4).add(DetailViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(FavoriteViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(HomeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SearchViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends App_HiltComponents.ViewModelC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<GamesUseCase> provideTrackerUseCasesProvider;

    private Provider<DetailViewModel> detailViewModelProvider;

    private Provider<FavoriteViewModel> favoriteViewModelProvider;

    private Provider<HomeViewModel> homeViewModelProvider;

    private Provider<SearchViewModel> searchViewModelProvider;

    private ViewModelCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam);

    }

    private GamesUseCase gamesUseCase() {
      return UseCaseModule_ProvideTrackerUseCasesFactory.provideTrackerUseCases(singletonC.provideMoviesRepositoryProvider.get());
    }

    private DetailViewModel detailViewModel() {
      return new DetailViewModel(provideTrackerUseCasesProvider.get());
    }

    private FavoriteViewModel favoriteViewModel() {
      return new FavoriteViewModel(provideTrackerUseCasesProvider.get());
    }

    private HomeViewModel homeViewModel() {
      return new HomeViewModel(provideTrackerUseCasesProvider.get());
    }

    private SearchViewModel searchViewModel() {
      return new SearchViewModel(provideTrackerUseCasesProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam) {
      this.provideTrackerUseCasesProvider = DoubleCheck.provider(new SwitchingProvider<GamesUseCase>(singletonC, activityRetainedCImpl, viewModelCImpl, 1));
      this.detailViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 0);
      this.favoriteViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 2);
      this.homeViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 3);
      this.searchViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 4);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(4).put("com.example.games.detail.viewmodel.DetailViewModel", (Provider) detailViewModelProvider).put("com.example.games.favorite.viewmodel.FavoriteViewModel", (Provider) favoriteViewModelProvider).put("com.example.games.home.viewmodel.HomeViewModel", (Provider) homeViewModelProvider).put("com.example.games.search.viewmodel.SearchViewModel", (Provider) searchViewModelProvider).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerApp_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(DaggerApp_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.example.games.detail.viewmodel.DetailViewModel 
          return (T) viewModelCImpl.detailViewModel();

          case 1: // com.example.core.use_case.GamesUseCase 
          return (T) viewModelCImpl.gamesUseCase();

          case 2: // com.example.games.favorite.viewmodel.FavoriteViewModel 
          return (T) viewModelCImpl.favoriteViewModel();

          case 3: // com.example.games.home.viewmodel.HomeViewModel 
          return (T) viewModelCImpl.homeViewModel();

          case 4: // com.example.games.search.viewmodel.SearchViewModel 
          return (T) viewModelCImpl.searchViewModel();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends App_HiltComponents.ActivityRetainedC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(DaggerApp_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonC, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerApp_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(DaggerApp_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends App_HiltComponents.ServiceC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(DaggerApp_HiltComponents_SingletonC singletonC, Service serviceParam) {
      this.singletonC = singletonC;


    }
  }

  private static final class SwitchingProvider<T> implements Provider<T> {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final int id;

    SwitchingProvider(DaggerApp_HiltComponents_SingletonC singletonC, int id) {
      this.singletonC = singletonC;
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.example.core.repository.GamesRepository 
        return (T) singletonC.gamesRepository();

        case 1: // com.example.core.network.service.ApiServices 
        return (T) singletonC.apiServices();

        case 2: // okhttp3.OkHttpClient 
        return (T) GamesModule_ProvideOkhttpClientFactory.provideOkhttpClient();

        case 3: // com.example.core.local.GamesDatabase 
        return (T) singletonC.gamesDatabase();

        default: throw new AssertionError(id);
      }
    }
  }
}
