// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelUngrimCape extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer cape;
	private final ModelRenderer dragonHead;
	private final ModelRenderer dragonHead2;
	private final ModelRenderer horn;
	private final ModelRenderer horn2;

	public WFMModelUngrimCape() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 4.0F, 1.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -1.0F, -3.0F, 8, 12, 4, 0.0F, false));

		cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 1.0F, 4.0F);
		body.addChild(cape);
		setRotationAngle(cape, 0.2182F, 0.0F, 0.0F);
		cape.cubeList.add(new ModelBox(cape, 32, 0, -8.0F, -2.0F, 0.0F, 16, 21, 0, 0.0F, false));

		dragonHead = new ModelRenderer(this);
		dragonHead.setRotationPoint(5.0F, -1.0F, 0.0F);
		body.addChild(dragonHead);
		dragonHead.cubeList.add(new ModelBox(dragonHead, 0, 23, -1.0F, -3.0F, -3.0F, 5, 4, 5, 0.0F, false));

		dragonHead2 = new ModelRenderer(this);
		dragonHead2.setRotationPoint(1.0F, 0.0F, -5.0F);
		dragonHead.addChild(dragonHead2);
		dragonHead2.cubeList.add(new ModelBox(dragonHead2, 21, 25, -1.5F, -2.0F, -1.0F, 4, 4, 3, 0.0F, false));

		horn = new ModelRenderer(this);
		horn.setRotationPoint(-1.0F, -3.0F, 2.0F);
		dragonHead.addChild(horn);
		setRotationAngle(horn, 0.6545F, 0.0F, 0.0F);
		horn.cubeList.add(new ModelBox(horn, 41, 26, 0.5F, -1.0F, -1.0F, 1, 1, 5, 0.0F, false));

		horn2 = new ModelRenderer(this);
		horn2.setRotationPoint(2.0F, -3.0F, 2.0F);
		dragonHead.addChild(horn2);
		setRotationAngle(horn2, 0.6545F, 0.0F, 0.0F);
		horn2.cubeList.add(new ModelBox(horn2, 41, 26, 0.5F, -1.0F, -1.0F, 1, 1, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}