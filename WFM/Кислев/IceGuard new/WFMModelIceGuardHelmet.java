// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Шлем Гвардейца extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;

	public Шлем Гвардейца() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.75F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 1.0F, false));
		Head.cubeList.add(new ModelBox(Head, 42, 53, 3.25F, -5.75F, -3.5F, 3, 3, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 52, 47, 2.5F, -6.5F, -5.25F, 3, 3, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 52, 47, 2.5F, -5.0F, 2.5F, 3, 3, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 52, 47, -5.5F, -5.0F, 2.5F, 3, 3, 3, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 42, 53, -6.25F, -5.75F, -3.5F, 3, 3, 8, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 52, 47, -5.5F, -6.5F, -5.25F, 3, 3, 3, 0.0F, true));
		Head.cubeList.add(new ModelBox(Head, 42, 41, -4.0F, -4.0F, 3.25F, 8, 3, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 42, 41, -4.0F, -8.0F, -5.75F, 8, 3, 3, 0.0F, false));

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -6.5F, -6.5F);
		Head.addChild(head_r1);
		setRotationAngle(head_r1, -0.0436F, 0.0436F, 0.7854F);
		head_r1.cubeList.add(new ModelBox(head_r1, 27, 61, -1.5F, -1.5F, 0.3F, 2, 2, 1, 0.0F, false));

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(0.0F, -8.0F, 1.0F);
		Head.addChild(head_r2);
		setRotationAngle(head_r2, -0.0869F, 0.0152F, 0.0862F);
		head_r2.cubeList.add(new ModelBox(head_r2, 0, 36, -4.0F, -2.0F, -5.0F, 8, 2, 8, 0.1F, false));

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(0.0F, -8.3279F, 0.9924F);
		Head.addChild(head_r3);
		setRotationAngle(head_r3, -0.1745F, 0.0F, 0.1745F);
		head_r3.cubeList.add(new ModelBox(head_r3, 0, 22, -2.5F, -2.85F, -3.5F, 5, 2, 5, -0.2F, false));

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(0.0F, -8.3279F, 0.9924F);
		Head.addChild(head_r4);
		setRotationAngle(head_r4, -0.3444F, -0.0036F, 0.1403F);
		head_r4.cubeList.add(new ModelBox(head_r4, 24, 25, -1.0F, -3.6F, -2.5F, 2, 2, 2, -0.1F, false));
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