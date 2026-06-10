// Made with Blockbench 4.6.0
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer overlay;
	private final ModelRenderer mark;
	private final ModelRenderer rippon;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		overlay = new ModelRenderer(this);
		overlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(overlay);
		overlay.cubeList.add(new ModelBox(overlay, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		mark = new ModelRenderer(this);
		mark.setRotationPoint(-1.0F, -8.0F, -3.0F);
		helmet.addChild(mark);
		mark.cubeList.add(new ModelBox(mark, 0, 23, -3.5F, -8.0F, 0.0F, 9, 9, 0, 0.0F, false));

		rippon = new ModelRenderer(this);
		rippon.setRotationPoint(0.0F, -8.5F, 4.5F);
		helmet.addChild(rippon);
		setRotationAngle(rippon, 0.0F, -0.0873F, 0.0F);
		rippon.cubeList.add(new ModelBox(rippon, 34, 6, 0.0F, -5.5F, -7.5F, 0, 11, 15, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		helmet.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}