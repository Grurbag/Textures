// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer overlay;
	private final ModelRenderer horn;
	private final ModelRenderer horn2;

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

		horn = new ModelRenderer(this);
		horn.setRotationPoint(-2.0F, -8.0F, -4.0F);
		helmet.addChild(horn);
		setRotationAngle(horn, 0.0F, -0.2618F, 0.0F);
		horn.cubeList.add(new ModelBox(horn, 0, 6, 0.5176F, -10.0F, -6.0681F, 0, 12, 12, 0.0F, false));

		horn2 = new ModelRenderer(this);
		horn2.setRotationPoint(2.0F, -6.0F, -4.0F);
		helmet.addChild(horn2);
		setRotationAngle(horn2, 0.0F, 0.2618F, 0.0F);
		horn2.cubeList.add(new ModelBox(horn2, 0, 6, -0.5176F, -12.0F, -6.0681F, 0, 12, 12, 0.0F, false));
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