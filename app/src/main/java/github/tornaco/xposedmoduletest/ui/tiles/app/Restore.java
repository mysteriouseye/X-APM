package github.tornaco.xposedmoduletest.ui.tiles.app;

import android.content.Context;
import android.view.View;

import dev.nick.tiles.tile.QuickTile;
import dev.nick.tiles.tile.QuickTileView;
import github.tornaco.xposedmoduletest.R;
import github.tornaco.xposedmoduletest.ui.activity.NavigatorActivityBottomNav;

/**
 * Created by guohao4 on 2017/11/16.
 * Email: Tornaco@163.com
 */

public class Restore extends QuickTile {

    public Restore(final Context context) {
        super(context);

        this.titleRes = R.string.title_restore;
        this.summaryRes = R.string.summary_title_restore;
        this.iconRes = R.drawable.ic_import_export_black_24dp;

        this.tileView = new QuickTileView(context, this) {
            @Override
            public void onClick(View v) {
                super.onClick(v);
                NavigatorActivityBottomNav ad = (NavigatorActivityBottomNav) context;
                ad.onRequestRestore();
            }
        };
    }
}
