// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelCogsmithHelmet extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer cog2;
	private final ModelRenderer cog1_r1;
	private final ModelRenderer cog1_r2;
	private final ModelRenderer cog1_r3;
	private final ModelRenderer cog1_r4;
	private final ModelRenderer cog1_r5;

	public WFMModelCogsmithHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, 0.0F, 3.1416F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.75F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 1.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 50, -6.0F, -6.0F, -6.0F, 12, 2, 12, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 52, 16, 1.0F, -5.0F, 4.0F, 3, 3, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 41, -4.0F, -10.0F, -4.0F, 8, 1, 8, 0.0F, false));

		cog2 = new ModelRenderer(this);
		cog2.setRotationPoint(-6.0F, -12.0F, 0.0F);
		Head.addChild(cog2);
		setRotationAngle(cog2, 0.0F, -1.5708F, 0.0F);
		cog2.cubeList.add(new ModelBox(cog2, 6, 57, -6.0F, 3.5F, -6.5F, 1, 3, 1, 0.1F, false));
		cog2.cubeList.add(new ModelBox(cog2, 0, 58, -7.0F, 4.0F, -6.5F, 1, 2, 1, 0.0F, false));

		cog1_r1 = new ModelRenderer(this);
		cog1_r1.setRotationPoint(0.0F, 5.0F, -6.0F);
		cog2.addChild(cog1_r1);
		setRotationAngle(cog1_r1, 0.0F, 0.0F, 2.618F);
		cog1_r1.cubeList.add(new ModelBox(cog1_r1, 6, 57, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));
		cog1_r1.cubeList.add(new ModelBox(cog1_r1, 0, 58, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cog1_r2 = new ModelRenderer(this);
		cog1_r2.setRotationPoint(0.0F, 5.0F, -6.0F);
		cog2.addChild(cog1_r2);
		setRotationAngle(cog1_r2, 0.0F, 0.0F, 2.0944F);
		cog1_r2.cubeList.add(new ModelBox(cog1_r2, 6, 57, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));
		cog1_r2.cubeList.add(new ModelBox(cog1_r2, 0, 58, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cog1_r3 = new ModelRenderer(this);
		cog1_r3.setRotationPoint(0.0F, 5.0F, -6.0F);
		cog2.addChild(cog1_r3);
		setRotationAngle(cog1_r3, 0.0F, 0.0F, 1.0472F);
		cog1_r3.cubeList.add(new ModelBox(cog1_r3, 0, 58, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r3.cubeList.add(new ModelBox(cog1_r3, 6, 57, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r4 = new ModelRenderer(this);
		cog1_r4.setRotationPoint(0.0F, 5.0F, -6.0F);
		cog2.addChild(cog1_r4);
		setRotationAngle(cog1_r4, 0.0F, 0.0F, 1.5708F);
		cog1_r4.cubeList.add(new ModelBox(cog1_r4, 0, 58, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r4.cubeList.add(new ModelBox(cog1_r4, 6, 57, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));

		cog1_r5 = new ModelRenderer(this);
		cog1_r5.setRotationPoint(0.0F, 5.0F, -6.0F);
		cog2.addChild(cog1_r5);
		setRotationAngle(cog1_r5, 0.0F, 0.0F, 0.5236F);
		cog1_r5.cubeList.add(new ModelBox(cog1_r5, 0, 58, -7.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cog1_r5.cubeList.add(new ModelBox(cog1_r5, 6, 57, -6.0F, -1.5F, -0.5F, 1, 3, 1, 0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}